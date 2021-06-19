package io.github.yeffycodegit.pastemystjava.types;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents any of the languages pastemyst uses.
 **/
public class Language {
    /** The name of the language. **/
    @Getter
    @Setter
    private String name;

    /** The language mode to be used by the pastemyst editor. **/
    @Getter
    @Setter
    private String mode;

    /** Mimes used by the language. **/
    @Getter
    @Setter
    private String[] mimes;

    /** Extensions of the language. **/
    @Getter
    @Setter
    private String[] extensions;

    /** The colour representing the language. **/
    @Getter
    @Setter
    private String colour;
}
