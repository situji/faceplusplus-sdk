package com.majp.facepluseplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author pc
 * @since 2018/1/18.
 */
public class HeadPose {
    private Float pitchAngle;
    private Float rollAngle;
    private Float yawAngle;

    @JsonProperty("pitch_angle")
    public Float getPitchAngle() {
        return pitchAngle;
    }

    public void setPitchAngle(Float pitchAngle) {
        this.pitchAngle = pitchAngle;
    }

    @JsonProperty("roll_angle")
    public Float getRollAngle() {
        return rollAngle;
    }

    public void setRollAngle(Float rollAngle) {
        this.rollAngle = rollAngle;
    }

    @JsonProperty("yaw_angle")
    public Float getYawAngle() {
        return yawAngle;
    }

    public void setYawAngle(Float yawAngle) {
        this.yawAngle = yawAngle;
    }
}
