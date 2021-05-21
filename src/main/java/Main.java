import io.github.yeffycodegit.pastemystjava.Pastemyst;
import io.github.yeffycodegit.pastemystjava.core.Client;
import io.github.yeffycodegit.pastemystjava.core.PastemystApi;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Pastemyst pastemyst = new Pastemyst();
        System.out.println(pastemyst.time.whenPasteShouldExpire("1588441258", "1w"));
    }
}
