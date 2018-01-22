package com.majp.facepluseplus.request.faceset;

import com.majp.facepluseplus.annotation.Param;
import com.majp.facepluseplus.request.FaceRequest;
import com.majp.facepluseplus.response.faceset.FaceSetDeleteResponse;

/**
 * @author pc
 * @since 2018/1/18.
 */
public class FaceSetDeleteRequest extends FaceRequest<FaceSetDeleteResponse> {

    @Param(name = "faceset_token")
    private String faceSetToken;

    @Param(name = "outer_id")
    private String outerId;

    @Param(name = "check_empty")
    private Integer checkEmpty;

    public void setFaceSetToken(String faceSetToken) {
        this.faceSetToken = faceSetToken;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setCheckEmpty(Integer checkEmpty) {
        this.checkEmpty = checkEmpty;
    }

    @Override
    public String getApi() {
        return "/facepp/v3/faceset/delete";
    }
}
