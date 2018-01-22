package com.majp.facepluseplus.request.face;

import com.majp.facepluseplus.annotation.Param;
import com.majp.facepluseplus.request.FaceRequest;
import com.majp.facepluseplus.response.face.FaceAnalyzeResponse;

/**
 * @author pc
 * @since 2018/1/18.
 */
public class FaceAnalyzeRequest extends FaceRequest<FaceAnalyzeResponse> {

    @Param(name = "face_tokens")
    private String faceTokens;

    @Param(name = "return_landmark")
    private Integer returnLandmark;

    @Param(name = "return_attributes")
    private String returnAttributes;

    public void setFaceTokens(String faceTokens) {
        this.faceTokens = faceTokens;
    }

    public void setReturnLandmark(Integer returnLandmark) {
        this.returnLandmark = returnLandmark;
    }

    public void setReturnAttributes(String returnAttributes) {
        this.returnAttributes = returnAttributes;
    }

    @Override
    public String getApi() {
        return "/facepp/v3/face/analyze";
    }
}