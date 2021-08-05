package io.github.yeffycodegit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.yeffycodegit.pastemystjava.core.Client;
import io.github.yeffycodegit.pastemystjava.endpoints.UserEndpoint;
import io.github.yeffycodegit.pastemystjava.types.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

@DisplayName("Tests for the user endpoint")
public class UserEndpointTests {
    private UserEndpoint user;

    @BeforeEach
    public void setup() throws Exception {
        user = new UserEndpoint(new Client());
    }

    @Test
    @DisplayName("Get a user from pastemyst")
    public void getUserTest() throws IOException, InterruptedException, ExecutionException {
        User codemyst = user.getUser("CodeMyst");

        assertEquals("CodeMyst", codemyst.getUsername());
        assertEquals(true, codemyst.isContributer());
        assertEquals(true, codemyst.isPublicProfile());
        assertEquals("bcfu7961", codemyst.get_id());
        assertEquals("D", codemyst.getDefaultLang());
        assertEquals(0, codemyst.getSupportLength());
        assertEquals("https://avatars3.githubusercontent.com/u/7966628?v=4", codemyst.getAvatarUrl());
    }


}
