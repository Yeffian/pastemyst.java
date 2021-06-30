package io.github.yeffycodegit.pastemystjava.types;

import java.util.List;

/**
 * Class to create a new edit for a {@code Paste}
 **/
public class PasteEdit {
    /**
     * The new title for the paste.
     **/
    private String title;

    /**
     * New isPrivate value.
     **/
    private boolean isPrivate;

    /**
     * New isPublic value.
     **/
    private boolean isPublic;

    /**
     * New tags added to the paste.
     **/
    private String tags;

    /**
     * New pasties added to the paste.
     **/
    private List<Pasty> pasties;

    public PasteEdit(String title, boolean isPrivate, boolean isPublic, String tags, List<Pasty> pasties) {
        this.title = title;
        this.isPrivate = isPrivate;
        this.isPublic = isPublic;
        this.tags = tags;
        this.pasties = pasties;
    }
}
