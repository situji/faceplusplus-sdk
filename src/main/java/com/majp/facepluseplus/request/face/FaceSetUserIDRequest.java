package com.majp.facepluseplus.request.face;

import com.majp.facepluseplus.annotation.Param;
import com.majp.facepluseplus.request.FaceRequest;
import com.majp.facepluseplus.response.face.FaceSetUserIDResponse;

/**
 * @author pc
 * @since 2018/1/18.
 */
public class FaceSetUserIDRequest extends FaceRequest<FaceSetUserIDResponse> {

    @Param(name = "face_token")
    private String faceToken;

    @Param(name = "user_id")
    private String userId;

    public void setFaceToken(String faceToken) {
        this.faceToken = faceToken;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String getApi() {
        return "/facepp/v3/face/setuserid";
    }
}
