package com.majp.facepluseplus.response.faceset;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.majp.facepluseplus.response.FaceResponse;

/**
 * @author pc
 * @since 2018/1/17.
 */
public class FaceSetUpdateResponse extends FaceResponse {
    private String faceSetToken;
    private String outerId;

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
}
