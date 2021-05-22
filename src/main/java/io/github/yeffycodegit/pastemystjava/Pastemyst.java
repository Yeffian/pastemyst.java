package io.github.yeffycodegit.pastemystjava;

import io.github.yeffycodegit.pastemystjava.core.Client;
import io.github.yeffycodegit.pastemystjava.endpoints.Data;
import io.github.yeffycodegit.pastemystjava.endpoints.Time;

/**
 * The core class of the library. From this class, all the functions from all the different endpoints can be accessed.
 **/
public class Pastemyst {
    private Client client;
    public Time time;
    public Data data;


    public Pastemyst() {
        client = new Client();
        time = new Time(client);
        data = new Data(client);
    }

}
