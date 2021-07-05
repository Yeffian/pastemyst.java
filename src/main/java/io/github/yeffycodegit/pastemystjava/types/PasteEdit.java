package io.github.yeffycodegit.pastemystjava.types;

import lombok.Getter;

import java.util.List;

/**
 * Class to create a new edit for a {@code Paste}
 **/
public class PasteEdit {
    /**
     * The id of the paste thats being edited.
     **/
    @Getter
    private String _id;

    /**
     * The new title for the paste.
     **/
    @Getter
    private String title;

    /**
     * New isPrivate value.
     **/
    @Getter
    private boolean isPrivate;

    /**
     * New isPublic value.
     **/
    @Getter
    private boolean isPublic;

    /**
     * New tags added to the paste.
     **/
    @Getter
    private String tags;

    /**
     * New pasties added to the paste.
     **/
    @Getter
    private List<Pasty> pasties;

    public PasteEdit(String title, String _id, boolean isPrivate, boolean isPublic, String tags, List<Pasty> pasties) {
        this.title = title;
        this._id = _id;
        this.isPrivate = isPrivate;
        this.isPublic = isPublic;
        this.tags = tags;
        this.pasties = pasties;
    }
}
