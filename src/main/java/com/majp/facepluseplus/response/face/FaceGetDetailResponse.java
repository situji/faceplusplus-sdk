package com.majp.facepluseplus.response.face;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.majp.facepluseplus.model.FaceRectangle;
import com.majp.facepluseplus.model.FaceSet;
import com.majp.facepluseplus.response.FaceResponse;

import java.util.List;

/**
 * @author pc
 * @since 2018/1/18.
 */
public class FaceGetDetailResponse extends FaceResponse {
    private String faceToken;
    private String userId;
    private FaceRectangle faceRectangle;
    private List<FaceSet> faceSets;

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

    @JsonProperty("face_rectangle")
    public FaceRectangle getFaceRectangle() {
        return faceRectangle;
    }

    public void setFaceRectangle(FaceRectangle faceRectangle) {
        this.faceRectangle = faceRectangle;
    }

    @JsonProperty("facesets")
    public List<FaceSet> getFaceSets() {
        return faceSets;
    }

    public void setFaceSets(List<FaceSet> faceSets) {
        this.faceSets = faceSets;
    }
}
