package io.github.yeffycodegit.pastemystjava;

import io.github.yeffycodegit.pastemystjava.lib.Pastemyst;
import io.github.yeffycodegit.pastemystjava.types.Pasty;
import io.github.yeffycodegit.pastemystjava.types.User;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Pastemyst pastemyst = new Pastemyst();
        pastemyst.user.getUserPasteIds("d7LkmnTPUWMTWQCVyv85MV1M74YBKBfDiKh7tCbHjPA=");
    }
}
