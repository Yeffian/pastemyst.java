package io.github.yeffycodegit.pastemystjava.lib;

import io.github.yeffycodegit.pastemystjava.Pastemyst;
import io.github.yeffycodegit.pastemystjava.types.Language;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Pastemyst pastemyst = new Pastemyst();
        System.out.println(pastemyst.data.getLangByExtension("py").getName());
    }
}
