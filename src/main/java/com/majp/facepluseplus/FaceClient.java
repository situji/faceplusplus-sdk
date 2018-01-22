package com.majp.facepluseplus;

import com.majp.facepluseplus.request.FaceRequest;
import com.majp.facepluseplus.response.FaceResponse;

/**
 * @author pc
 * @since 2018/1/17.
 */
public interface FaceClient {
    @SuppressWarnings("unchecked")
    <T extends FaceResponse> T execute(FaceRequest<T> request);
}
