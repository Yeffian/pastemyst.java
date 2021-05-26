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
public class DataEndpoint {
    private Client client;

    public DataEndpoint(Client client) {
        this.client = client;
    }

    private static final String ENDPOINT = PastemystApi.BASE_ENDPOINT + PastemystApi.DATA;

    /**
     * Gets a {@code Language} object, give the name of the language.
     *
     * @param lang The name of the language.
     * @return {@code Language} The language that was asked for.
     * @throws IOException
     * @throws InterruptedException
     **/
    public Language getLangByName(String lang) throws IOException, InterruptedException {
        String langByNameEndpoint = String.format("/language?name=%s", lang);

        JSONObject obj = new JSONObject(client.get(ENDPOINT + langByNameEndpoint));

        return newLang(obj);
    }

    /**
     * Gets a {@code Language} object, give the file extension of the language.
     *
     * @param extension The extension of the language.
     * @return {@code Language} The language that was asked for.
     * @throws IOException
     * @throws InterruptedException
     **/
    public Language getLangByExtension(String extension) throws IOException, InterruptedException {
        String langByExtensionEndpoint = String.format("/languageExt?extension=%s", extension);

        JSONObject obj = new JSONObject(client.get(ENDPOINT + langByExtensionEndpoint));

        return newLang(obj);
    }

    /**
     * Utility function to convert a {@code JSONArray} to a {@code String[]}.
     *
     * @param jsonArray The {@code JSONArray} to convert.
     * @return {@code String[]} the String array formed from the json array.
     **/
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

    /**
     * Utility function to create a new {@code Language} object by parsing a {@code JSONObject}.
     *
     * @param obj The {@code JSONObject} to parse.
     * @return {@code Language} The language object created from parsing the {@code JSONObject}.
     **/
    private Language newLang(JSONObject obj) {
        Language language = new Language();

        language.setName(obj.get("name").toString());
        language.setColour(obj.get("color").toString());
        language.setMode(obj.get("mode").toString());
        language.setMimes(convertToStringArray((JSONArray) obj.get("mimes")));
        language.setExtensions(convertToStringArray((JSONArray) obj.get("ext")));

        return language;
    }
}