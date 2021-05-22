package io.github.yeffycodegit.pastemystjava.types;

/**
 * Represents a user on pastemyst.
 **/
public class User {
    /** The id of the user. **/
    private String _id;

    /** The username of the user. **/
    private String username;

    /** The avatar url of the user. **/
    private String avatarUrl;

    /** The default language of the user. **/
    private String defaultLang;

    /** If the user has a public profile or not. **/
    private boolean publicProfile;

    /** How long the user has been a supporter, 0 if not a supporter. **/
    private int supportLength;

    /** If the user is a contributer or not. **/
    private boolean contributer;
}
