package com.majp.facepluseplus.model;

/**
 * @author pc
 * @since 2018/1/18.
 */
public class Blur {

    private Blurness blurness;

    public Blurness getBlurness() {
        return blurness;
    }

    public void setBlurness(Blurness blurness) {
        this.blurness = blurness;
    }

    class Blurness {
        private Float value;
        private Float threshold;

        public Float getValue() {
            return value;
        }

        public void setValue(Float value) {
            this.value = value;
        }

        public Float getThreshold() {
            return threshold;
        }

        public void setThreshold(Float threshold) {
            this.threshold = threshold;
        }
    }
}
