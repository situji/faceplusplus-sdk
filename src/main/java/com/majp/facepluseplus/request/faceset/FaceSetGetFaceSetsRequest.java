package com.majp.facepluseplus.request.faceset;

import com.majp.facepluseplus.annotation.Param;
import com.majp.facepluseplus.request.FaceRequest;
import com.majp.facepluseplus.response.faceset.FaceSetGetFaceSetsResponse;

/**
 * @author pc
 * @since 2018/1/18.
 */
public class FaceSetGetFaceSetsRequest extends FaceRequest<FaceSetGetFaceSetsResponse> {

    @Param(name = "tags")
    private String tags;

    @Param(name = "start")
    private Integer start;

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    @Override
    public String getApi() {
        return "/facepp/v3/faceset/getfacesets";
    }
}
