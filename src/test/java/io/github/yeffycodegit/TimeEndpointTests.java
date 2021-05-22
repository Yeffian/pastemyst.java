package io.github.yeffycodegit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.github.yeffycodegit.pastemystjava.core.Client;
import io.github.yeffycodegit.pastemystjava.endpoints.Time;

public class TimeEndpointTests {
    private Time time;

    @BeforeEach
    public void setup() throws Exception {
        time = new Time(new Client());
    }

    @Test
    @DisplayName("When a paste should expire")
    public void whenPasteShouldExpireTest() {
        assertEquals(time.whenPasteShouldExpire("1588441258", "1w"), "1589046058");
        assertEquals(time.whenPasteShouldExpire("1615242814", "2h"), "1615250014");
        assertEquals(time.whenPasteShouldExpire("1615297946", "1w"), "1615902746");
        assertEquals(time.whenPasteShouldExpire("1615242814", "2h"), "1615250014");
    }
}
