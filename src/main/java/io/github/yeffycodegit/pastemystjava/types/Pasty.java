package io.github.yeffycodegit.pastemystjava.types;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a Pasty object on pastemyst.
 * @see Pasty https://paste.myst.rs/api-docs/objects
 **/
public class Pasty {

    /**
     * The ID of the pasty.
     **/
    @Getter
    @Setter
    private String _id;

    /**
     * The language of the pasty.
     **/
    @Getter
    @Setter
    private String language;

    /**
     * The title of the pasty.
     **/
    @Getter
    @Setter
    private String title;

    /**
     * The contents of the pasty.
     **/
    @Getter
    @Setter
    private String code;
}
