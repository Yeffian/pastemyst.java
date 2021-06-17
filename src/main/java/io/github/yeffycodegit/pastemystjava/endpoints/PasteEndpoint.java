package io.github.yeffycodegit.pastemystjava.endpoints;

import io.github.yeffycodegit.pastemystjava.core.Client;
import io.github.yeffycodegit.pastemystjava.core.PastemystApi;
import io.github.yeffycodegit.pastemystjava.types.Paste;
import io.github.yeffycodegit.pastemystjava.types.Pasty;
import lombok.NonNull;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents the PasteEndpoint endpoint on pastemyst. Used for creating, deleting, and getting data on pastes.
 **/
public class PasteEndpoint {
    private final String ENDPOINT = PastemystApi.BASE_ENDPOINT + PastemystApi.PASTE;
    private Client client;

    public PasteEndpoint(Client client) { this.client = client; }

    /**
     * Get a paste from a paste id.
     *
     * @param id The id of the paste.
     * @return {@code Paste} the returned paste object.
     **/
    public Paste getPaste(@NonNull String id) {

    }

    /**
     * Create a new paste with a {@code Paste} object.
     *
     * @apiNote If you want the paste to be tied to your user account, check {@code createPasteOnAccount}
     *
     * @param paste The paste to create.
     **/
    public void createPaste(@NonNull Paste paste) {

    }

    /**
     * Create a new paste with a {@codde Paste} object tied to your user account.
     *
     * @param paste The paste to create.
     * @param token The user account token.
     **/
    public void createPasteOnAccount(@NonNull Paste paste, @NonNull String token) {

    }
}
