package com.majp.facepluseplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author pc
 * @since 2018/1/18.
 */
public class MouthStatus {
    private Float surgicalMaskOrRespirator;
    private Float otherOcclusion;
    private Float close;
    private Float open;

    @JsonProperty("surgical_mask_or_respirator")
    public Float getSurgicalMaskOrRespirator() {
        return surgicalMaskOrRespirator;
    }

    public void setSurgicalMaskOrRespirator(Float surgicalMaskOrRespirator) {
        this.surgicalMaskOrRespirator = surgicalMaskOrRespirator;
    }

    @JsonProperty("other_occlusion")
    public Float getOtherOcclusion() {
        return otherOcclusion;
    }

    public void setOtherOcclusion(Float otherOcclusion) {
        this.otherOcclusion = otherOcclusion;
    }

    public Float getClose() {
        return close;
    }

    public void setClose(Float close) {
        this.close = close;
    }

    public Float getOpen() {
        return open;
    }

    public void setOpen(Float open) {
        this.open = open;
    }
}
