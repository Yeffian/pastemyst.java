package io.github.yeffycodegit.pastemystjava.types;

/**
 * Represents a Paste object on pastemyst.
 *
 * @see Paste https://paste.myst.rs/api-docs/objects
 **/
public class Paste {
    /**
     * The id of the paste.
     **/
    private String _id;

    /**
     * The ID of the owner, if it doesn't have an owner it's set to an empty string.
     **/
    private String ownerId;

    /**
     * The title of the paste.
     **/
    private String title;

    /**
     * The unix time of when the paste is created
     **/
    private long createdAt;

    /**
     * The time when the paste will expire, possible values are never, 1h, 2h, 10h, 1d, 2d, 1w, 1m, 1y.
     **/
    private String expiresIn;

    /**
     * The time when the paste will be deleted, if it has no expiry time it's set to 0.
     **/
    private long deletesAt;

    /**
     * The number of stars the paste received.
     **/
    private int stars;

    /**
     * If the paste is private, its only accessible by the owner of the paste.
     **/
    private boolean isPrivate;

    /**
     * If the paste is displayed on the owner's public profile.
     **/
    private boolean isPublic;

    /**
     * List of tags on the paste.
     **/
    private String[] tags;

    /**
     * List of pasties/files in the paste.
     * @apiNote  This array cannot be empty.
     **/
    private Pasty[] pasties;

    /**
     * List of edits on the paste.
     **/
    private Edit[] edits;
}
