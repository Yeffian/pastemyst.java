package io.github.yeffycodegit.pastemystjava.types;

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
    private int createdAt;

    /**
     * The time when the paste will expire, possible values are never, 1h, 2h, 10h, 1d, 2d, 1w, 1m, 1y.
     **/
    private String expiresIn;

    /**
     * The time when the paste will be deleted, if it has no expiry time it's set to 0.
     **/
    private int deletesAt;

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
    private List<Pasty> pasties;

    /**
     * List of edits on the paste.
     **/
    private Edit[] edits;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
    }

    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

    public int getDeletesAt() {
        return deletesAt;
    }

    public void setDeletesAt(int deletesAt) {
        this.deletesAt = deletesAt;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public List<Pasty> getPasties() {
        return pasties;
    }

    public void setPasties(List<Pasty> pasties) {
        this.pasties = pasties;
    }

    public Edit[] getEdits() {
        return edits;
    }

    public void setEdits(Edit[] edits) {
        this.edits = edits;
    }
}
