package io.github.yeffycodegit.pastemystjava.types;

/**
 * Represents a Pasty object on pastemyst.
 * @see Pasty https://paste.myst.rs/api-docs/objects
 **/
public class Pasty {

    /**
     * The ID of the pasty.
     **/
    private String _id;

    /**
     * The language of the pasty.
     **/
    private String language;

    /**
     * The title of the pasty.
     **/
    private String title;

    /**
     * The contents of the pasty.
     **/
    private String code;
}
