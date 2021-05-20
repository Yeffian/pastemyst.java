import io.github.yeffycodegit.pastemystjava.Pastemyst;
import io.github.yeffycodegit.pastemystjava.core.Client;
import io.github.yeffycodegit.pastemystjava.core.PastemystApi;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Pastemyst pastemyst = new Pastemyst();
        pastemyst.client.patch("https://webhook.site/365124dd-0801-4760-9d43-e367e00a1ca2", "Look this is a patch request eeeeeeeeeeeeee");
    }
}
