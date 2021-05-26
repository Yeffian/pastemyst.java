package io.github.yeffycodegit.pastemystjava.endpoints;

import io.github.yeffycodegit.pastemystjava.core.Client;
import io.github.yeffycodegit.pastemystjava.core.PastemystApi;
import io.github.yeffycodegit.pastemystjava.types.User;
import org.json.JSONObject;

import java.io.IOException;

/**
 * Represents the User endpoint on pastemyst. Used for getting data related to users on pastemyst.
 **/
public class UserEndpoint {
    private Client client;

    public UserEndpoint(Client client) {
        this.client = client;
    }

    private static final String ENDPOINT = PastemystApi.BASE_ENDPOINT + PastemystApi.USER;

    public boolean getIfUserExists(String username) throws IOException, InterruptedException {
        String notFoundMsg = "{\"statusMessage]\":\"Not Found\"}";

        String ifUserExistsEndpoint = String.format("/%s/exists", username);

        String res = client.get(ENDPOINT + ifUserExistsEndpoint);

        if(client.status == 200) return true;

        return false;
    }

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

}
