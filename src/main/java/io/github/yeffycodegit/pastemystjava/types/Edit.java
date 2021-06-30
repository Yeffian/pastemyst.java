package io.github.yeffycodegit.pastemystjava.types;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

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
    private transient String _id;

    /**
     * The ID of the edit, multiple edits can share the same id showing that multiple fields were changed at the same time.
     **/
    @Getter
    @Setter
    private transient String editId;

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
    private transient int editType;

    /**
     * Various metadata used by pastemyst internally.
     **/
    @Getter
    @Setter
    private transient String[] metadata;

    /**
     * The actual paste edit, it stores old data before the edit as the current paste stores the new data.
     **/
    @Getter
    @Setter
    private transient String edit;

    /**
     * The unix time of when the edit was made.
     **/
    @Getter
    @Setter
    private transient long editedAt;
}
