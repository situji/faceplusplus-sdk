package com.majp.facepluseplus.request.faceset;

import com.majp.facepluseplus.annotation.Param;
import com.majp.facepluseplus.request.FaceRequest;
import com.majp.facepluseplus.response.faceset.FaceSetGetDetailResponse;

/**
 * @author pc
 * @since 2018/1/18.
 */
public class FaceSetGetDetailRequest extends FaceRequest<FaceSetGetDetailResponse> {

    @Param(name = "faceset_token")
    private String faceSetToken;

    @Param(name = "outer_id")
    private String outerId;

    @Param(name = "start")
    private Integer start;

    public void setFaceSetToken(String faceSetToken) {
        this.faceSetToken = faceSetToken;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    @Override
    public String getApi() {
        return "/facepp/v3/faceset/getdetail";
    }
}
