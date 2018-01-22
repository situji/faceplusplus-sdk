package com.majp.facepluseplus.request.faceset;

import com.majp.facepluseplus.annotation.Param;
import com.majp.facepluseplus.request.FaceRequest;
import com.majp.facepluseplus.response.faceset.FaceSetCreateResponse;

/**
 * @author pc
 * @since 2018/1/17.
 */
public class FaceSetCreateRequest extends FaceRequest<FaceSetCreateResponse> {

    @Param(name = "display_name")
    private String displayName;

    @Param(name = "outer_id")
    private String outerId;

    @Param(name = "tags")
    private String tags;

    @Param(name = "face_tokens")
    private String faceTokens;

    @Param(name = "user_data")
    private String userData;

    @Param(name = "force_merge")
    private Integer forceMerge;

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void setFaceTokens(String faceTokens) {
        this.faceTokens = faceTokens;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public void setForceMerge(Integer forceMerge) {
        this.forceMerge = forceMerge;
    }

    @Override
    public String getApi() {
        return "/facepp/v3/faceset/create";
    }
}
