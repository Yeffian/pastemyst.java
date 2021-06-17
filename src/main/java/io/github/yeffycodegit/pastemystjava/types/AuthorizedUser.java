package io.github.yeffycodegit.pastemystjava.types;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class SelfUser {
    /** The id of the user. **/
    @Getter
    @Setter
    private String _id;

    /** The username of the user. **/
    @Getter
    @Setter
    private String username;

    /** The avatar url of the user. **/
    @Getter
    @Setter
    private String avatarUrl;

    /** The default language of the user. **/
    @Getter
    @Setter
    private String defaultLang;

    /** If the user has a public profile or not. **/
    @Getter
    @Setter
    private boolean publicProfile;

    /** How long the user has been a supporter, 0 if not a supporter. **/
    @Getter
    @Setter
    private int supportLength;

    /** If the user is a contributer or not. **/
    @Getter
    @Setter
    private boolean contributer;

    /** List of paste id's the user has starred. **/
    @Getter
    @Setter
    private String[] stars;

    /** User ids of the service the user used to create an account. **/
    @Getter
    @Setter
    private Object serviceIds;
}
