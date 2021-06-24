<h1 align="center">Pastemyst.java</h1>

<p><strong>pastemyst.java</strong> is a API Wrapper, written in Java. The library is in early development, and all contributions are welcome.</p>
<p>Check out Pastemyst here https://paste.myst.rs/</p>

<h1>Get the language by name and extension</h1>

```java
import io.github.yeffycodegit.pastemystjava.lib.Pastemyst;
import io.github.yeffycodegit.pastemystjava.types.Language;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException, InterruptedException {
        Pastemyst pastemyst = new Pastemyst();

        Language langByName = pastemyst.data.getLangByName("Python");
        Language langByExt = pastemyst.data.getLangByExtension("py");
    }
}
```

<h1>Get when the paste should expire</h1>

```java
import io.github.yeffycodegit.pastemystjava.lib.Pastemyst;

public class Main {
public static void main(String[] args) {
Pastemyst pastemyst = new Pastemyst();

        System.out.println(pastemyst.time.whenPasteShouldExpire("1588441258", "1w"));
    }
}
```