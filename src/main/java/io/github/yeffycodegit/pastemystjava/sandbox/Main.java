package io.github.yeffycodegit.pastemystjava.sandbox;

import io.github.yeffycodegit.pastemystjava.lib.Pastemyst;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Pastemyst pastemyst = new Pastemyst();
        System.out.println(pastemyst.data.getLangByName("Python").getName());
    }
}
