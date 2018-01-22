package com.majp.facepluseplus.response.faceset;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.majp.facepluseplus.response.FaceResponse;

import java.util.List;

/**
 * @author pc
 * @since 2018/1/17.
 */
public class FaceSetGetDetailResponse extends FaceResponse {
    private String faceSetToken;
    private String outerId;
    private String displayName;
    private String userData;
    private String tags;
    private Integer faceCount;
    private List<String> faceTokens;
    private String next;

    @JsonProperty("faceset_token")
    public String getFaceSetToken() {
        return faceSetToken;
    }

    public void setFaceSetToken(String faceSetToken) {
        this.faceSetToken = faceSetToken;
    }

    @JsonProperty("outer_id")
    public String getOuterId() {
        return outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("user_data")
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @JsonProperty("face_count")
    public Integer getFaceCount() {
        return faceCount;
    }

    public void setFaceCount(Integer faceCount) {
        this.faceCount = faceCount;
    }

    @JsonProperty("face_tokens")
    public List<String> getFaceTokens() {
        return faceTokens;
    }

    public void setFaceTokens(List<String> faceTokens) {
        this.faceTokens = faceTokens;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }
}
