package com.amigoscode.awsimageupload.profile;

import java.util.Objects;
import java.util.UUID;

public class UserProfile {

    private UUID userProfileId;
    private String username;
    private String userProfileImageKey; //S3 key

    public UserProfile(UUID userProfileId, String username, String userProfileImageKey) {
        this.userProfileId = userProfileId;
        this.username = username;
        this.userProfileImageKey = userProfileImageKey;
    }

    public UUID getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(UUID userProfileId) {
        this.userProfileId = userProfileId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserProfileImageKey() {
        return userProfileImageKey;
    }

    public void setUserProfileImageKey(String userProfileImageKey) {
        this.userProfileImageKey = userProfileImageKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserProfile that)) return false;
        return Objects.equals(userProfileId, that.userProfileId) &&
                Objects.equals(username, that.username) &&
                Objects.equals(userProfileImageKey, that.userProfileImageKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileId, username, userProfileImageKey);
    }
}
