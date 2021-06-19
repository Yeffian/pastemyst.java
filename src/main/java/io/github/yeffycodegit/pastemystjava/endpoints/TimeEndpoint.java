package io.github.yeffycodegit.pastemystjava.endpoints;

import io.github.yeffycodegit.pastemystjava.core.Client;
import io.github.yeffycodegit.pastemystjava.core.PastemystApi;
import lombok.NonNull;
import org.json.JSONObject;

/**
 * Represents the Time endpoint on pastemyst. Used for getting useful data related to time.
 **/
public class TimeEndpoint {
    private static final String ENDPOINT = PastemystApi.BASE_ENDPOINT + PastemystApi.TIME;
    private final Client client;

    public TimeEndpoint(Client client) {
        this.client = client;
    }

    /**
     * Returns the time a paste should expire, given a time when the hypothetical paste was created and a time when the hypothetical paste expires.
     *
     * @param createdAt The time the hypothetical paste was created.
     * @param expiresIn The time the hypothetical paste expires.
     * @return {@code String} A string containing when the paste should expire.
     **/
    public String whenPasteShouldExpire(@NonNull String createdAt, @NonNull String expiresIn) {
        String whenPasteShouldExpireEndpoint = String.format("/expiresInToUnixTime?createdAt=%s&expiresIn=%s", createdAt, expiresIn);

        try {
           JSONObject obj = new JSONObject(client.get(ENDPOINT + whenPasteShouldExpireEndpoint));
           return obj.get("result").toString();
        } catch(Exception e) {
            return null;
        }
    }
}
