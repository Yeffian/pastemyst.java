package io.github.yeffycodegit;

import io.github.yeffycodegit.pastemystjava.core.Client;


import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.yeffycodegit.pastemystjava.endpoints.Data;
import org.junit.jupiter.api.BeforeEach;

public class DataEndpointTests {
    private Data data;

    @BeforeEach
    public void setup() throws Exception {
        data = new Data(new Client());
    }
}
