package com.majp.facepluseplus.request.search;

import com.majp.facepluseplus.annotation.BinFile;
import com.majp.facepluseplus.annotation.Param;
import com.majp.facepluseplus.request.FaceRequest;
import com.majp.facepluseplus.response.search.SearchResponse;

import java.io.File;

/**
 * @author pc
 * @since 2018/1/18.
 */
public class SearchRequest extends FaceRequest<SearchResponse> {

    @Param(name = "face_token")
    private String faceToken;

    @Param(name = "image_url")
    private String imageUrl;

    @BinFile(name = "image_file")
    private File imageFile;

    @Param(name = "image_base64")
    private String imageBase64;

    @Param(name = "faceset_token")
    private String faceSetToken;

    @Param(name = "outer_id")
    private String outerId;

    @Param(name = "return_result_count")
    private Integer returnResultCount;

    @Param(name = "face_rectangle")
    private String faceRectangle;

    public void setFaceToken(String faceToken) {
        this.faceToken = faceToken;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setImageFile(File imageFile) {
        this.imageFile = imageFile;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    public void setFaceSetToken(String faceSetToken) {
        this.faceSetToken = faceSetToken;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setReturnResultCount(Integer returnResultCount) {
        this.returnResultCount = returnResultCount;
    }

    public void setFaceRectangle(String faceRectangle) {
        this.faceRectangle = faceRectangle;
    }

    @Override
    public String getApi() {
        return "/facepp/v3/search";
    }
}
