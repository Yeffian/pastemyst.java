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

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getDefaultLang() {
        return defaultLang;
    }

    public void setDefaultLang(String defaultLang) {
        this.defaultLang = defaultLang;
    }

    public boolean isPublicProfile() {
        return publicProfile;
    }

    public void setPublicProfile(boolean publicProfile) {
        this.publicProfile = publicProfile;
    }

    public int getSupportLength() {
        return supportLength;
    }

    public void setSupportLength(int supportLength) {
        this.supportLength = supportLength;
    }

    public boolean isContributer() {
        return contributer;
    }

    public void setContributer(boolean contributer) {
        this.contributer = contributer;
    }
}
