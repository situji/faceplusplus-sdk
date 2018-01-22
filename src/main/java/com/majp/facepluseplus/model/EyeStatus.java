package com.majp.facepluseplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author pc
 * @since 2018/1/18.
 */
public class EyeStatus {
    private Status leftEyeStatus;
    private Status rightEyeStatus;

    @JsonProperty("left_eye_status")
    public Status getLeftEyeStatus() {
        return leftEyeStatus;
    }

    public void setLeftEyeStatus(Status leftEyeStatus) {
        this.leftEyeStatus = leftEyeStatus;
    }

    @JsonProperty("right_eye_status")
    public Status getRightEyeStatus() {
        return rightEyeStatus;
    }

    public void setRightEyeStatus(Status rightEyeStatus) {
        this.rightEyeStatus = rightEyeStatus;
    }

    class Status {
        private Float occlusion;
        private Float noGlassEyeOpen;
        private Float normalGlassEyeClose;
        private Float normalGlassEyeOpen;
        private Float darkGlasses;
        private Float noGlassEyeClose;

        public Float getOcclusion() {
            return occlusion;
        }

        public void setOcclusion(Float occlusion) {
            this.occlusion = occlusion;
        }

        @JsonProperty("no_glass_eye_open")
        public Float getNoGlassEyeOpen() {
            return noGlassEyeOpen;
        }

        public void setNoGlassEyeOpen(Float noGlassEyeOpen) {
            this.noGlassEyeOpen = noGlassEyeOpen;
        }

        @JsonProperty("normal_glass_eye_close")
        public Float getNormalGlassEyeClose() {
            return normalGlassEyeClose;
        }

        public void setNormalGlassEyeClose(Float normalGlassEyeClose) {
            this.normalGlassEyeClose = normalGlassEyeClose;
        }

        @JsonProperty("normal_glass_eye_open")
        public Float getNormalGlassEyeOpen() {
            return normalGlassEyeOpen;
        }

        public void setNormalGlassEyeOpen(Float normalGlassEyeOpen) {
            this.normalGlassEyeOpen = normalGlassEyeOpen;
        }

        @JsonProperty("dark_glasses")
        public Float getDarkGlasses() {
            return darkGlasses;
        }

        public void setDarkGlasses(Float darkGlasses) {
            this.darkGlasses = darkGlasses;
        }

        @JsonProperty("no_glass_eye_close")
        public Float getNoGlassEyeClose() {
            return noGlassEyeClose;
        }

        public void setNoGlassEyeClose(Float noGlassEyeClose) {
            this.noGlassEyeClose = noGlassEyeClose;
        }
    }
}
