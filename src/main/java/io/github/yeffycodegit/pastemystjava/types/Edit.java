package io.github.yeffycodegit.pastemystjava.types;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents the Edit object on pastemyst.
 *
 * @see Edit https://paste.myst.rs/api-docs/objects
 **/
public class Edit {

    /**
     * The unique ID of the edit.
     **/
    @Getter
    @Setter
    private String _id;

    /**
     * The ID of the edit, multiple edits can share the same id showing that multiple fields were changed at the same time.
     **/
    @Getter
    @Setter
    private String editId;

    /**
     * The type of edit, possible values are:
     *
     * - title(0)
     * - pastyTitle(1)
     * - pastyLanguage(2)
     * - pastyContent(3)
     * - pastyAdded(4)
     * - pastyRemoved(5)
     **/
    @Getter
    @Setter
    private int editType;

    /**
     * Various metadata used by pastemyst internally.
     **/
    @Getter
    @Setter
    private String[] metadata;

    /**
     * The actual paste edit, it stores old data before the edit as the current paste stores the new data.
     **/
    @Getter
    @Setter
    private String edit;

    /**
     * The unix time of when the edit was made.
     **/
    @Getter
    @Setter
    private long editedAt;
}
