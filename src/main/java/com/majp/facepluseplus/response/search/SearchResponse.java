package com.majp.facepluseplus.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.majp.facepluseplus.model.Face;
import com.majp.facepluseplus.model.Result;
import com.majp.facepluseplus.response.FaceResponse;

import java.util.List;
import java.util.Map;

/**
 * @author pc
 * @since 2018/1/18.
 */
public class SearchResponse extends FaceResponse {
    private List<Result> results;
    private Map<String,Float> thresholds;
    private String imageId;
    private List<Face> faces;

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Map<String, Float> getThresholds() {
        return thresholds;
    }

    public void setThresholds(Map<String, Float> thresholds) {
        this.thresholds = thresholds;
    }

    @JsonProperty("image_id")
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public List<Face> getFaces() {
        return faces;
    }

    public void setFaces(List<Face> faces) {
        this.faces = faces;
    }
}
