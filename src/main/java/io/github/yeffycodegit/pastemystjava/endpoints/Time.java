package io.github.yeffycodegit.pastemystjava.endpoints;

import io.github.yeffycodegit.pastemystjava.core.Client;
import io.github.yeffycodegit.pastemystjava.core.PastemystApi;
import org.json.JSONObject;

/**
 * Represents the Time endpoint on pastemyst. Used for getting useful data related to time.
 **/
public class Time {
    private static final String ENDPOINT = PastemystApi.BASE_ENDPOINT + PastemystApi.TIME;
    Client client;

    public Time(Client client) {
        this.client = client;
    }

    public String whenPasteShouldExpire(String createdAt, String expiresIn) {
        String whenPasteShouldExpireEndpoint = String.format("/expiresInToUnixTime?createdAt=%s&expiresIn=%s", createdAt, expiresIn);

        try {
           JSONObject obj = new JSONObject(client.get(ENDPOINT + whenPasteShouldExpireEndpoint));
           return obj.get("result").toString();
        } catch(Exception e) {
            return null;
        }
    }
}
