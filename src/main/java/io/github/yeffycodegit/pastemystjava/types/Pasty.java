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

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
