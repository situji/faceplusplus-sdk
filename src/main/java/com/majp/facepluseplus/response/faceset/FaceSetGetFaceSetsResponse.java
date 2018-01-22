package com.majp.facepluseplus.response.faceset;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.majp.facepluseplus.model.FaceSet;
import com.majp.facepluseplus.response.FaceResponse;

import java.util.List;

/**
 * @author pc
 * @since 2018/1/17.
 */
public class FaceSetGetFaceSetsResponse extends FaceResponse {
    private List<FaceSet> faceSets;
    private String next;

    @JsonProperty("facesets")
    public List<FaceSet> getFaceSets() {
        return faceSets;
    }

    public void setFaceSets(List<FaceSet> faceSets) {
        this.faceSets = faceSets;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }
}
