package com.majp.facepluseplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author pc
 * @since 2018/1/18.
 */
public class Beauty {
    private Float maleScore;
    private Float femaleScore;

    @JsonProperty("male_score")
    public Float getMaleScore() {
        return maleScore;
    }

    public void setMaleScore(Float maleScore) {
        this.maleScore = maleScore;
    }

    @JsonProperty("female_score")
    public Float getFemaleScore() {
        return femaleScore;
    }

    public void setFemaleScore(Float femaleScore) {
        this.femaleScore = femaleScore;
    }
}
