package com.majp.facepluseplus.response.face;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.majp.facepluseplus.response.FaceResponse;

/**
 * @author pc
 * @since 2018/1/18.
 */
public class FaceSetUserIDResponse extends FaceResponse {
    private String faceToken;
    private String userId;

    @JsonProperty("face_token")
    public String getFaceToken() {
        return faceToken;
    }

    public void setFaceToken(String faceToken) {
        this.faceToken = faceToken;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
