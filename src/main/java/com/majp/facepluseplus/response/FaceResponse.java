package com.majp.facepluseplus.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author pc
 * @since 2018/1/17.
 */
public abstract class FaceResponse {
    private String requestId;
    private Integer timeUsed;
    private String errorMessage;

    @JsonProperty("request_id")
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @JsonProperty("time_used")
    public Integer getTimeUsed() {
        return timeUsed;
    }

    public void setTimeUsed(Integer timeUsed) {
        this.timeUsed = timeUsed;
    }

    @JsonProperty("error_message")
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
