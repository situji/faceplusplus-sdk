package com.majp.facepluseplus.request.face;

import com.majp.facepluseplus.annotation.Param;
import com.majp.facepluseplus.request.FaceRequest;
import com.majp.facepluseplus.response.face.FaceGetDetailResponse;

/**
 * @author pc
 * @since 2018/1/18.
 */
public class FaceGetDetailRequest extends FaceRequest<FaceGetDetailResponse> {

    @Param(name = "face_token")
    private String faceToken;

    public void setFaceToken(String faceToken) {
        this.faceToken = faceToken;
    }

    @Override
    public String getApi() {
        return "/facepp/v3/face/getdetail";
    }
}
