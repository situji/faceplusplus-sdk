package com.majp.facepluseplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author pc
 * @since 2018/1/18.
 */
public class Face {
    private String faceToken;
    private FaceRectangle faceRectangle;
    private Object landmark;
    private Attribute attribute;

    @JsonProperty("face_token")
    public String getFaceToken() {
        return faceToken;
    }

    public void setFaceToken(String faceToken) {
        this.faceToken = faceToken;
    }

    @JsonProperty("face_rectangle")
    public FaceRectangle getFaceRectangle() {
        return faceRectangle;
    }

    public void setFaceRectangle(FaceRectangle faceRectangle) {
        this.faceRectangle = faceRectangle;
    }

    public Object getLandmark() {
        return landmark;
    }

    public void setLandmark(Object landmark) {
        this.landmark = landmark;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }
}
