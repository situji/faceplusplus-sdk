package com.majp.facepluseplus.response.face;

import com.majp.facepluseplus.model.Face;
import com.majp.facepluseplus.response.FaceResponse;

import java.util.List;

/**
 * @author pc
 * @since 2018/1/18.
 */
public class FaceAnalyzeResponse extends FaceResponse {
    private List<Face> faces;

    public List<Face> getFaces() {
        return faces;
    }

    public void setFaces(List<Face> faces) {
        this.faces = faces;
    }
}
