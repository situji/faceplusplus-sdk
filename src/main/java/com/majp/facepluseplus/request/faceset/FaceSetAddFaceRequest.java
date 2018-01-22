package com.majp.facepluseplus.request.faceset;

import com.majp.facepluseplus.annotation.Param;
import com.majp.facepluseplus.request.FaceRequest;
import com.majp.facepluseplus.response.faceset.FaceSetAddFaceResponse;

/**
 * @author pc
 * @since 2018/1/17.
 */
public class FaceSetAddFaceRequest extends FaceRequest<FaceSetAddFaceResponse> {

    @Param(name = "faceset_token")
    private String faceSetToken;

    @Param(name = "outer_id")
    private String outerId;

    @Param(name = "face_tokens")
    private String faceTokens;

    public void setFaceSetToken(String faceSetToken) {
        this.faceSetToken = faceSetToken;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setFaceTokens(String faceTokens) {
        this.faceTokens = faceTokens;
    }

    @Override
    public String getApi() {
        return "/facepp/v3/faceset/addface";
    }
}
