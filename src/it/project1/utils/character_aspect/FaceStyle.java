package it.project1.utils.character_aspect;

public class FaceStyle {
    private String faceType;
    private String makeUp;
    private String eyeType;
    private String mouth;
    private String ears;
    private String beard;

    public FaceStyle(String faceType, String makeUp, String eyeType, String mouth, String ears, String beard) {
        this.faceType = faceType;
        this.makeUp = makeUp;
        this.eyeType = eyeType;
        this.mouth = mouth;
        this.ears = ears;
        this.beard = beard;
    }

    public String getFaceType() {
        return faceType;
    }

    public void setFaceType(String faceType) {
        this.faceType = faceType;
    }

    public String getMakeUp() {
        return makeUp;
    }

    public void setMakeUp(String makeUp) {
        this.makeUp = makeUp;
    }

    public String getEyeType() {
        return eyeType;
    }

    public void setEyeType(String eyeType) {
        this.eyeType = eyeType;
    }

    public String getMouth() {
        return mouth;
    }

    public void setMouth(String mouth) {
        this.mouth = mouth;
    }

    public String getEars() {
        return ears;
    }

    public void setEars(String ears) {
        this.ears = ears;
    }

    public String getBeard() {
        return beard;
    }

    public void setBeard(String beard) {
        this.beard = beard;
    }
}
