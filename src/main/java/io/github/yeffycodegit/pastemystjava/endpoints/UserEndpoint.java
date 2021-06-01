package io.github.yeffycodegit.pastemystjava.endpoints;

import io.github.yeffycodegit.pastemystjava.core.Client;
import io.github.yeffycodegit.pastemystjava.core.PastemystApi;
import io.github.yeffycodegit.pastemystjava.types.User;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents the User endpoint on pastemyst. Used for getting data related to users on pastemyst.
 **/
public class UserEndpoint {
    private Client client;

    public UserEndpoint(Client client) {
        this.client = client;
    }

    private static final String ENDPOINT = PastemystApi.BASE_ENDPOINT + PastemystApi.USER;

    /**
     * Checks if a given user exists on pastemyst.
     *
     * @throws IOException
     * @throws InterruptedException
     * @param username The user to check for.
     * @return {@code boolean} If the user exists or not.
     **/
    public boolean getIfUserExists(String username) throws IOException, InterruptedException {
        String notFoundMsg = "{\"statusMessage]\":\"Not Found\"}";

        String ifUserExistsEndpoint = String.format("/%s/exists", username);

        String res = client.get(ENDPOINT + ifUserExistsEndpoint);

        if(client.status == 200) return true;

        return false;
    }

    /**
     * Gets a user on pastemyst.
     *
     * @throws IOException
     * @throws InterruptedException
     * @param username The user to get.
     * @return {@code User} the user.
     **/
    public User getUser(String username) throws IOException, InterruptedException {
        User user = new User();

        String getUserEndpoint = String.format("/%s", username);

        JSONObject obj = new JSONObject(client.get(ENDPOINT + getUserEndpoint));

        user.setUsername(obj.get("username").toString());
        user.setContributer((boolean)obj.get("contributor"));
        user.set_id(obj.get("_id").toString());
        user.setAvatarUrl(obj.get("avatarUrl").toString());
        user.setPublicProfile((boolean)obj.get("publicProfile"));
        user.setDefaultLang(obj.get("defaultLang").toString());
        user.setSupportLength((int)obj.get("supporterLength"));

        return user;
    }

    /**
     * Gets all the paste ids of a user on pastemyst, given a token.
     *
     * @param token The token to use to find the user.
     * @throws IOException
     * @throws InterruptedException
     * @return The {@code String[]} which contains all the paste id's.
     **/
    public String[] getUserPasteIds(String token) throws IOException, InterruptedException {
       String getUserPastesEndpoint = "/self/pastes";

       List<String> ids = new ArrayList<String>();

       JSONArray obj = new JSONArray(client.get(ENDPOINT + getUserPastesEndpoint, token));

       for(Object id : obj) {
           id = id.toString();

           ids.add(id.toString());
       }

       String idsArr[] = new String[ids.size()];

        for (int j = 0; j < ids.size(); j++) {
            idsArr[j] = ids.get(j);
        }

        return idsArr;
    }

    /**
     * Get a user on pastemyst using a user token.
     *
     * @param token The token to use to find the user.
     * @return {@code User} the user.
     * @throws IOException
     * @throws InterruptedException
     **/
    public User getUserByToken(String token) throws IOException, InterruptedException {
        User user = new User();

        String getUserEndpoint = String.format("/self");

        JSONObject obj = new JSONObject(client.get(ENDPOINT + getUserEndpoint, token));

        user.setUsername(obj.get("username").toString());
        user.setContributer((boolean)obj.get("contributor"));
        user.set_id(obj.get("_id").toString());
        user.setAvatarUrl(obj.get("avatarUrl").toString());
        user.setPublicProfile((boolean)obj.get("publicProfile"));
        user.setDefaultLang(obj.get("defaultLang").toString());
        user.setSupportLength((int)obj.get("supporterLength"));
        user.setServiceIds(obj.get("serviceIds"));
        user.setStars(convertToStringArray((JSONArray)obj.get("stars")));

        return user;
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

}
