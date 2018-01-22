package com.majp.facepluseplus.request.faceset;

import com.majp.facepluseplus.annotation.Param;
import com.majp.facepluseplus.request.FaceRequest;
import com.majp.facepluseplus.response.faceset.FaceSetUpdateResponse;

/**
 * @author pc
 * @since 2018/1/17.
 */
public class FaceSetUpdateRequest extends FaceRequest<FaceSetUpdateResponse> {

    @Param(name = "faceset_token")
    private String faceSetToken;

    @Param(name = "outer_id")
    private String outerId;

    @Param(name = "new_outer_id")
    private String newOuterId;

    @Param(name = "display_name")
    private String displayName;

    @Param(name = "user_data")
    private String userData;

    @Param(name = "tags")
    private String tags;

    public void setFaceSetToken(String faceSetToken) {
        this.faceSetToken = faceSetToken;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setNewOuterId(String newOuterId) {
        this.newOuterId = newOuterId;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public String getApi() {
        return "/facepp/v3/faceset/update";
    }
}
