package io.github.yeffycodegit.pastemystjava.types;

/**
 * Represents any of the languages pastemyst uses.
 **/
public class Language {
    /** The name of the language. **/
    private String name;

    /** The language mode to be used by the pastemyst editor. **/
    private String mode;

    /** Mimes used by the language. **/
    private String[] mimes;

    /** Extensions of the language. **/
    private String[] extensions;

    /** The colour representing the language. **/
    private String colour;

    public String getColour() {
        return colour;
    }

    public String[] getExtensions() {
        return extensions;
    }

    public String[] getMimes() {
        return mimes;
    }

    public String getMode() {
        return mode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void setMimes(String[] mimes) {
        this.mimes = mimes;
    }

    public void setExtensions(String[] extensions) {
        this.extensions = extensions;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
