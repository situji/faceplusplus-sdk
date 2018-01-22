package com.majp.facepluseplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author pc
 * @since 2018/1/17.
 */
public class FailureDetail {
    private String faceToken;
    private String reason;

    @JsonProperty("face_token")
    public String getFaceToken() {
        return faceToken;
    }

    public void setFaceToken(String faceToken) {
        this.faceToken = faceToken;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
