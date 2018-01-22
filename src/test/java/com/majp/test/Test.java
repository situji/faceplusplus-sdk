package com.majp.test;

import com.majp.facepluseplus.DefayltFaceClient;
import com.majp.facepluseplus.FaceClient;
import com.majp.facepluseplus.request.faceset.FaceSetGetFaceSetsRequest;
import com.majp.facepluseplus.response.faceset.FaceSetGetFaceSetsResponse;

/**
 * @author pc
 * @since 2018/1/18.
 */
public class Test {

    public static void main(String[] args) {
        String apiKey = "oFJ_k43XBmCDomxgL0V7Ts0bKgPCRp3f";
        String apiSecret = "6zamRq9Nc0W0ayCRR9TvcynNs2xk5YGa";
        String serverUrl = "https://api-cn.faceplusplus.com";
        FaceClient faceClient = new DefayltFaceClient(apiKey, apiSecret, serverUrl);
//        FaceSetCreateRequest faceSetCreateRequest = new FaceSetCreateRequest();
//        faceSetCreateRequest.setOuterId("newfaceset");
//        faceSetCreateRequest.setTags("person,male");
//        faceSetCreateRequest.setFaceTokens("c2fc0ad7c8da3af5a34b9c70ff764da0");
//        FaceSetCreateResponse response = faceClient.execute(faceSetCreateRequest);
//        System.out.println(response.getFaceSetToken());
        FaceSetGetFaceSetsRequest faceSetGetFaceSetsRequest = new FaceSetGetFaceSetsRequest();
        FaceSetGetFaceSetsResponse faceSetGetFaceSetsResponse = faceClient.execute(faceSetGetFaceSetsRequest);
        if (!"CONCURRENCY_LIMIT_EXCEEDED".equals(faceSetGetFaceSetsResponse.getErrorMessage())) {
            System.out.println(1);
        }
    }
}
