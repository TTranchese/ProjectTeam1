package it.project1.utils.character_aspect;

public class VoiceStyle {

    private String voiceType;
    private String voicePitch;

    public VoiceStyle(String voiceType, String voicePitch) {
        this.voiceType = voiceType;
        this.voicePitch = voicePitch;
    }

    public String getVoiceType() {
        return voiceType;
    }

    public void setVoiceType(String voiceType) {
        this.voiceType = voiceType;
    }

    public String getVoicePitch() {
        return voicePitch;
    }

    public void setVoicePitch(String voicePitch) {
        this.voicePitch = voicePitch;
    }
}
