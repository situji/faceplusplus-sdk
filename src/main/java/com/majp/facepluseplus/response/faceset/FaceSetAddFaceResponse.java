package com.majp.facepluseplus.response.faceset;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.majp.facepluseplus.model.FailureDetail;
import com.majp.facepluseplus.response.FaceResponse;

import java.util.List;

/**
 * @author pc
 * @since 2018/1/17.
 */
public class FaceSetAddFaceResponse extends FaceResponse {
    private String faceSetToken;
    private String outerId;
    private Integer faceAdded;
    private Integer faceCount;
    private List<FailureDetail> failureDetail;

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

    @JsonProperty("face_added")
    public Integer getFaceAdded() {
        return faceAdded;
    }

    public void setFaceAdded(Integer faceAdded) {
        this.faceAdded = faceAdded;
    }

    @JsonProperty("face_count")
    public Integer getFaceCount() {
        return faceCount;
    }

    public void setFaceCount(Integer faceCount) {
        this.faceCount = faceCount;
    }

    @JsonProperty("failure_detail")
    public List<FailureDetail> getFailureDetail() {
        return failureDetail;
    }

    public void setFailureDetail(List<FailureDetail> failureDetail) {
        this.failureDetail = failureDetail;
    }
}
