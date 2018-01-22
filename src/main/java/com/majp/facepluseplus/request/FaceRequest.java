package com.majp.facepluseplus.request;

import com.majp.facepluseplus.response.FaceResponse;

/**
 * @author pc
 * @since 2018/1/17.
 */
public abstract class FaceRequest<T extends FaceResponse> {

    public abstract String getApi();
}
