package io.github.yeffycodegit;

import io.github.yeffycodegit.pastemystjava.core.Client;


import static org.junit.jupiter.api.Assertions.assertEquals;

import io.github.yeffycodegit.pastemystjava.endpoints.Data;
import io.github.yeffycodegit.pastemystjava.types.Language;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

@DisplayName("Tests for the Data endpoint")
public class DataEndpointTests {
    private Data data;

    @BeforeEach
    public void setup() throws Exception {
        data = new Data(new Client());
    }

    @Test
    @DisplayName("get a language by its name")
    public void getLangByNameTest() {
        String[] mimes = new String[]{"text/x-python"};
        String[] extensions = new String[]{"BUILD", "bzl", "py", "pyw"};

        try {
            Language lang = data.getLangByName("Python");
            assertEquals("Python", lang.getName());
            assertEquals("#3572A5", lang.getColour());
            assertEquals("python", lang.getMode());

            for(int i = 0; i == lang.getMimes().length; i++) {
                assertEquals(mimes[i], lang.getMimes()[i]);
            }

            for(int i = 0; i == lang.getExtensions().length; i++) {
                assertEquals(extensions[i], lang.getExtensions()[i]);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("get a language by its extension")
    public void getLangByExtensionTest() {
        String[] mimes = new String[]{"text/x-python"};
        String[] extensions = new String[]{"BUILD", "bzl", "py", "pyw"};

        try {
            Language lang = data.getLangByExtension("py");
            assertEquals("Python", lang.getName());
            assertEquals("#3572A5", lang.getColour());
            assertEquals("python", lang.getMode());

            for(int i = 0; i == lang.getMimes().length; i++) {
                assertEquals(mimes[i], lang.getMimes()[i]);
            }

            for(int i = 0; i == lang.getExtensions().length; i++) {
                assertEquals(extensions[i], lang.getExtensions()[i]);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
