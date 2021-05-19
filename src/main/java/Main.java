import io.github.yeffycodegit.pastemystjava.core.Client;

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
