import io.github.yeffycodegit.pastemyst4j.core.Client;
import io.github.yeffycodegit.pastemyst4j.core.PastemystApi;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        try {
            client.post("https://reqres.in/api/users", "{\"name\": \"Upendra\", \"job\": \"Programmer\"}");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
