package io.github.yeffycodegit;

import io.github.yeffycodegit.pastemystjava.core.Client;
import io.github.yeffycodegit.pastemystjava.core.PastemystApi;
import io.github.yeffycodegit.pastemystjava.types.Edit;
import io.github.yeffycodegit.pastemystjava.types.Paste;


public class PasteEndpointTests {
    private Client client;

    public PasteEndpointTests(Client client) { this.client = client; }

    private static final String ENDPOINT = PastemystApi.BASE_ENDPOINT + PastemystApi.PASTE;

    public Paste getPasteById(String id) {
        return new Paste();
    }

    public void createPaste(Paste p) {

    }

    public void editPaste(Edit e) {

    }

    public void deletePaste(String id) {

    }
}
