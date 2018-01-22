package com.majp.facepluseplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author pc
 * @since 2018/1/18.
 */
public class Attribute {
    private String gender;
    private Integer age;
    private Smile smile;
    private HeadPose headPose;
    private Blur blur;
    private EyeStatus eyeStatus;
    private Emotion emotion;
    private FaceQuality faceQuality;
    private String ethnicity;
    private Beauty beauty;
    private MouthStatus mouthStatus;
    private EyeGaze eyeGaze;
    private SkinStatus skinStatus;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Smile getSmile() {
        return smile;
    }

    public void setSmile(Smile smile) {
        this.smile = smile;
    }

    @JsonProperty("headpose")
    public HeadPose getHeadPose() {
        return headPose;
    }

    public void setHeadPose(HeadPose headPose) {
        this.headPose = headPose;
    }

    public Blur getBlur() {
        return blur;
    }

    public void setBlur(Blur blur) {
        this.blur = blur;
    }

    @JsonProperty("eyestatus")
    public EyeStatus getEyeStatus() {
        return eyeStatus;
    }

    public void setEyeStatus(EyeStatus eyeStatus) {
        this.eyeStatus = eyeStatus;
    }

    public Emotion getEmotion() {
        return emotion;
    }

    public void setEmotion(Emotion emotion) {
        this.emotion = emotion;
    }

    @JsonProperty("facequality")
    public FaceQuality getFaceQuality() {
        return faceQuality;
    }

    public void setFaceQuality(FaceQuality faceQuality) {
        this.faceQuality = faceQuality;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public Beauty getBeauty() {
        return beauty;
    }

    public void setBeauty(Beauty beauty) {
        this.beauty = beauty;
    }

    @JsonProperty("mouthstatus")
    public MouthStatus getMouthStatus() {
        return mouthStatus;
    }

    public void setMouthStatus(MouthStatus mouthStatus) {
        this.mouthStatus = mouthStatus;
    }

    @JsonProperty("eyegaze")
    public EyeGaze getEyeGaze() {
        return eyeGaze;
    }

    public void setEyeGaze(EyeGaze eyeGaze) {
        this.eyeGaze = eyeGaze;
    }

    @JsonProperty("skinstatus")
    public SkinStatus getSkinStatus() {
        return skinStatus;
    }

    public void setSkinStatus(SkinStatus skinStatus) {
        this.skinStatus = skinStatus;
    }
}
