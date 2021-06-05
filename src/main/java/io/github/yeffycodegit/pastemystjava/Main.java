package io.github.yeffycodegit.pastemystjava;

import io.github.yeffycodegit.pastemystjava.lib.Pastemyst;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Pastemyst pastemyst = new Pastemyst();
        for(String id : pastemyst.user.getUserPasteIds("redacted")) {
            System.out.println(id);
        }
    }
}
