package com.majp.facepluseplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author pc
 * @since 2018/1/18.
 */
public class EyeGaze {

    private Gaze leftEyeGaze;
    private Gaze rightEyeGaze;

    @JsonProperty("left_eye_gaze")
    public Gaze getLeftEyeGaze() {
        return leftEyeGaze;
    }

    public void setLeftEyeGaze(Gaze leftEyeGaze) {
        this.leftEyeGaze = leftEyeGaze;
    }

    @JsonProperty("right_eye_gaze")
    public Gaze getRightEyeGaze() {
        return rightEyeGaze;
    }

    public void setRightEyeGaze(Gaze rightEyeGaze) {
        this.rightEyeGaze = rightEyeGaze;
    }

    class Gaze {
        private Float positionXCoordinate;
        private Float positionYCoordinate;
        private Float vectorXComponent;
        private Float vectorYComponent;
        private Float vectorZComponent;

        @JsonProperty("position_x_coordinate")
        public Float getPositionXCoordinate() {
            return positionXCoordinate;
        }

        public void setPositionXCoordinate(Float positionXCoordinate) {
            this.positionXCoordinate = positionXCoordinate;
        }

        @JsonProperty("position_y_coordinate")
        public Float getPositionYCoordinate() {
            return positionYCoordinate;
        }

        public void setPositionYCoordinate(Float positionYCoordinate) {
            this.positionYCoordinate = positionYCoordinate;
        }

        @JsonProperty("vector_x_component")
        public Float getVectorXComponent() {
            return vectorXComponent;
        }

        public void setVectorXComponent(Float vectorXComponent) {
            this.vectorXComponent = vectorXComponent;
        }

        @JsonProperty("vector_y_component")
        public Float getVectorYComponent() {
            return vectorYComponent;
        }

        public void setVectorYComponent(Float vectorYComponent) {
            this.vectorYComponent = vectorYComponent;
        }

        @JsonProperty("vector_z_component")
        public Float getVectorZComponent() {
            return vectorZComponent;
        }

        public void setVectorZComponent(Float vectorZComponent) {
            this.vectorZComponent = vectorZComponent;
        }
    }
}
