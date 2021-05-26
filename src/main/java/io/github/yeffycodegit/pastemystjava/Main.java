package io.github.yeffycodegit.pastemystjava;

import io.github.yeffycodegit.pastemystjava.lib.Pastemyst;
import io.github.yeffycodegit.pastemystjava.types.Pasty;
import io.github.yeffycodegit.pastemystjava.types.User;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Pastemyst pastemyst = new Pastemyst();
        User user = pastemyst.user.getUser("CodeMyst");

        System.out.println(user.getUsername());
        System.out.println(user.getDefaultLang());
    }
}
