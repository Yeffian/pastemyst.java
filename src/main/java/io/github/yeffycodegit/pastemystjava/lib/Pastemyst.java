package io.github.yeffycodegit.pastemystjava.lib;

import io.github.yeffycodegit.pastemystjava.core.Client;
import io.github.yeffycodegit.pastemystjava.endpoints.DataEndpoint;
import io.github.yeffycodegit.pastemystjava.endpoints.PasteEndpoint;
import io.github.yeffycodegit.pastemystjava.endpoints.TimeEndpoint;
import io.github.yeffycodegit.pastemystjava.endpoints.UserEndpoint;

/**
 * The core class of the library. From this class, all the functions from all the different endpoints can be accessed.
 **/
public class Pastemyst {
    public TimeEndpoint time;
    public DataEndpoint data;
    public PasteEndpoint paste;
    public UserEndpoint user;


    public Pastemyst() {
        Client client = new Client();

        time = new TimeEndpoint(client);
        data = new DataEndpoint(client);
        user = new UserEndpoint(client);
        paste = new PasteEndpoint(client);
    }

}
