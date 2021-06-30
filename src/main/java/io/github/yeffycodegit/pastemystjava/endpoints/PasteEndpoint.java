package io.github.yeffycodegit.pastemystjava.endpoints;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import io.github.yeffycodegit.pastemystjava.core.Client;
import io.github.yeffycodegit.pastemystjava.core.PastemystApi;
import io.github.yeffycodegit.pastemystjava.types.Edit;
import io.github.yeffycodegit.pastemystjava.types.PasteEdit;
import io.github.yeffycodegit.pastemystjava.types.Paste;
import io.github.yeffycodegit.pastemystjava.types.Pasty;
import lombok.NonNull;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Represents the PasteEndpoint endpoint on pastemyst. Used for creating, deleting, and getting data on pastes.
 **/
public class PasteEndpoint {
    private final String ENDPOINT = PastemystApi.BASE_ENDPOINT + PastemystApi.PASTE;
    private final Client client;

    public PasteEndpoint(Client client) { this.client = client; }

    /**
     * Get a paste from a paste id.
     *
     * @param id The id of the paste.
     * @return {@code Paste} the returned paste object.
     **/
    public Paste getPaste(@NonNull String id) throws IOException, InterruptedException {
        String getPasteEndpoint = String.format("/%s", id);

        Paste paste = new Paste();

        List<Pasty> pasties = new ArrayList<Pasty>();
        List<Edit> edits = new ArrayList<Edit>();
        List<String> tags = new ArrayList<String>();

        JSONObject obj = new JSONObject(client.get(ENDPOINT + getPasteEndpoint));

        JSONArray pastiesArray = obj.getJSONArray("pasties");
        JSONArray editsArray = obj.getJSONArray("edits");
        JSONArray tagsArray = obj.getJSONArray("tags");

        pastiesArray.forEach(e -> pasties.add(newPasty(new JSONObject(String.valueOf(e)))));
        editsArray.forEach(e -> edits.add(newEdit(new JSONObject(String.valueOf(e)))));
        tagsArray.forEach(e -> tags.add(e.toString()));


        paste.setPasties(pasties);
        paste.setEdits(edits);
        paste.setTags(tags.stream().collect(Collectors.joining(", ")));
        paste.setTitle(obj.get("title").toString());
        paste.set_id(obj.get("_id").toString());
        paste.setCreatedAt((int)obj.get("createdAt"));
        paste.setStars((int)obj.get("stars"));
        paste.setPrivate((boolean)obj.get("isPrivate"));
        paste.setPublic((boolean)obj.get("isPublic"));
        paste.set_id(obj.get("_id").toString());

        return paste;
    }

    /**
     * Create a new paste with a {@code Paste} object.
     *
     * @param paste The paste to create.
     **/
    public String createPaste(@NonNull Paste paste, @NonNull String token) throws IOException, InterruptedException {
        Gson gson = new Gson();
        
        JSONObject obj = new JSONObject(client.post(ENDPOINT, gson.toJson(paste), token));
        return obj.get("_id").toString();
    }

    public void editPaste(String id, Paste edit, String token) throws IOException, InterruptedException {

    }

    public void deletePaste(String id, String token) throws IOException, InterruptedException {
        String deletePasteEndpoint = String.format("/%s", id);

        client.delete(ENDPOINT + deletePasteEndpoint, token);
    }

    private Pasty newPasty(@NonNull JSONObject obj) {
        Pasty pasty = new Pasty();

        pasty.set_id(obj.get("_id").toString());
        pasty.setLanguage(obj.get("language").toString());
        pasty.setTitle(obj.get("title").toString());
        pasty.setCode(obj.get("code").toString());

        return pasty;
    }

    private Edit newEdit(@NonNull JSONObject obj) {
        Edit edit = new Edit();

        edit.setEdit(obj.get("edit").toString());
        edit.setEditId(obj.get("editId").toString());
        edit.set_id(obj.get("_id").toString());
        edit.setEditType((int)obj.get("editType"));
        edit.setEdit(obj.get("edit").toString());
        edit.setMetadata(convertToStringArray(obj.getJSONArray("metadata")));
        edit.setEditedAt((long)obj.get("editedAt"));

        return edit;
    }

    private String[] convertToStringArray(@NonNull JSONArray jsonArray) {
        String[] stringArray = null;

        if (jsonArray != null) {
            int length = jsonArray.length();
            stringArray = new String[length];

            for (int i = 0; i < length; i++) {
                stringArray[i] = jsonArray.optString(i);
            }
        }

        return stringArray;
    }
}
