package it.project1.character.character_aspect;

public class CharacterAspect {
    private String gender;
    private HairStyle hair;
    private FaceStyle face;
    private VoiceStyle voice;
    private BodyStyle body;
    private ClothingStyle cloth;

    /**
     * Constructor
     * @param gender
     * @param hair
     * @param face
     * @param voice
     * @param body
     * @param cloth
     */
    public CharacterAspect(String gender, HairStyle hair, FaceStyle face, VoiceStyle voice, BodyStyle body, ClothingStyle cloth) {
        this.gender = gender;
        this.hair = hair;
        this.face = face;
        this.voice = voice;
        this.body = body;
        this.cloth = cloth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public HairStyle getHair() {
        return hair;
    }

    public void setHair(HairStyle hair) {
        this.hair = hair;
    }

    public FaceStyle getFace() {
        return face;
    }

    public void setFace(FaceStyle face) {
        this.face = face;
    }

    public VoiceStyle getVoice() {
        return voice;
    }

    public void setVoice(VoiceStyle voice) {
        this.voice = voice;
    }

    public BodyStyle getBody() {
        return body;
    }

    public void setBody(BodyStyle body) {
        this.body = body;
    }

    public ClothingStyle getCloth() {
        return cloth;
    }

    public void setCloth(ClothingStyle cloth) {
        this.cloth = cloth;
    }
}
