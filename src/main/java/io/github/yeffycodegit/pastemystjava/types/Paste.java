package io.github.yeffycodegit.pastemystjava.types;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Represents a Paste object on pastemyst.
 *
 * @see Paste https://paste.myst.rs/api-docs/objects
 **/
public class Paste {
    /**
     * The id of the paste.
     **/
    @Getter
    @Setter
    private String _id;

    /**
     * The ID of the owner, if it doesn't have an owner it's set to an empty string.
     **/
    @Getter
    @Setter
    private transient String ownerId;

    /**
     * The title of the paste.
     **/
    @Getter
    @Setter
    private String title;

    /**
     * The unix time of when the paste is created
     **/
    @Getter
    @Setter
    private transient int createdAt;

    /**
     * The time when the paste will expire, possible values are never, 1h, 2h, 10h, 1d, 2d, 1w, 1m, 1y.
     **/
    @Getter
    @Setter
    private String expiresIn;

    /**
     * The time when the paste will be deleted, if it has no expiry time it's set to 0.
     **/
    @Getter
    @Setter
    private transient int deletesAt;

    /**
     * The number of stars the paste received.
     **/
    @Getter
    @Setter
    private transient int stars;

    /**
     * If the paste is private, its only accessible by the owner of the paste.
     **/
    @Getter
    @Setter
    private boolean isPrivate;

    /**
     * If the paste is displayed on the owner's public profile.
     **/
    @Getter
    @Setter
    private boolean isPublic;

    /**
     * List of tags on the paste.
     **/
    @Getter
    @Setter
    private String tags;

    /**
     * List of pasties/files in the paste.
     * @apiNote  This array cannot be empty.
     **/
    @Getter
    @Setter
    private List<Pasty> pasties;

    /**
     * List of edits on the paste.
     **/
    @Getter
    @Setter
    private transient List<Edit> edits;
}
