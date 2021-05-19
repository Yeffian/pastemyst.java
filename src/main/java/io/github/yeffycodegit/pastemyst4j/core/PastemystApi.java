package io.github.yeffycodegit.pastemyst4j.core;

/**
 * This class stores data about the Pastemyst Api, like endpoints, the version, etc.
 *
 * @author YeffyCodeGit
 * @version 1.0.0
 **/
public class PastemystApi {
    public static final String HOST = "https://paste.myst.rs";
    public static final int V = 2;
    public static final String BASE_ENDPOINT = HOST + "/api/v" + V;
    public static final String DATA = "/data";
    public static final String TIME = "/time";
    public static final String PASTE = "/paste";
    public static final String USER = "/user";
}
