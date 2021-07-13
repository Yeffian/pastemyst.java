<div align="center">
  
# Pastemyst.java
</div>

## What is pastemyst.java?
**pastemyst.java** is a [pastemyst][pastemyst-link] API Wrapper, written in Java. The library is in early development, and all contributions are welcome.

Check out pastemyst here: [paste.myst.rs][pastemyst-link]


# Examples

## Get the language by name and extension
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

## Get when the paste should expire
```java
import io.github.yeffycodegit.pastemystjava.lib.Pastemyst;

public class Main {
    public static void main(String[] args) {
        Pastemyst pastemyst = new Pastemyst();

        System.out.println(pastemyst.time.whenPasteShouldExpire("1588441258", "1w"));
    }
}
```

## Get a user on pastemyst/if a user exists on pastemyst
```java
import io.github.yeffycodegit.pastemystjava.lib.Pastemyst;
import io.github.yeffycodegit.pastemystjava.types.User;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Pastemyst pastemyst = new Pastemyst();

        User user = pastemyst.user.getUser("YeffyCodeGit");
        boolean exists = pastemyst.user.getIfUserExists("CodeMyst");
    }
}
```


[pastemyst-link]: https://github.com/codemyst/pastemyst "pastemyst on Github"
