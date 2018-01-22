package com.majp.facepluseplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author pc
 * @since 2018/1/18.
 */
public class SkinStatus {
    private Float health;
    private Float stain;
    private Float acne;
    private Float darkCircle;

    public Float getHealth() {
        return health;
    }

    public void setHealth(Float health) {
        this.health = health;
    }

    public Float getStain() {
        return stain;
    }

    public void setStain(Float stain) {
        this.stain = stain;
    }

    public Float getAcne() {
        return acne;
    }

    public void setAcne(Float acne) {
        this.acne = acne;
    }

    @JsonProperty("dark_circle")
    public Float getDarkCircle() {
        return darkCircle;
    }

    public void setDarkCircle(Float darkCircle) {
        this.darkCircle = darkCircle;
    }
}
