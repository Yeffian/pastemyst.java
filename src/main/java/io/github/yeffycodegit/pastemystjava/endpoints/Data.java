package io.github.yeffycodegit.pastemystjava.endpoints;

import io.github.yeffycodegit.pastemystjava.core.Client;
import io.github.yeffycodegit.pastemystjava.core.PastemystApi;
import io.github.yeffycodegit.pastemystjava.types.Language;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

/**
 * Represents the Data endpoint on pastemyst. Used for getting various simple data.
 **/
public class Data {
    private Client client;

    public Data(Client client) {
        this.client = client;
    }

    private static final String ENDPOINT = PastemystApi.BASE_ENDPOINT + PastemystApi.DATA;

    public Language getLangByName(String lang) throws IOException, InterruptedException {
        String langByNameEndpoint = String.format("/language?name=%s", lang);

        JSONObject obj = new JSONObject(client.get(ENDPOINT + langByNameEndpoint));

        return newLang(obj);
    }

    public Language getLangByExtension(String extension) throws IOException, InterruptedException {
        String langByExtensionEndpoint = String.format("/languageExt?extension=%s", extension);

        JSONObject obj = new JSONObject(client.get(ENDPOINT + langByExtensionEndpoint));

        return newLang(obj);
    }

    private String[] convertToStringArray(JSONArray jsonArray) {
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

    private Language newLang(JSONObject obj) {
        Language language = new Language();

        language.setName(obj.get("name").toString());
        language.setColour(obj.get("color").toString());
        language.setMimes(convertToStringArray((JSONArray) obj.get("mimes")));
        language.setExtensions(convertToStringArray((JSONArray) obj.get("ext")));

        return language;
    }
}