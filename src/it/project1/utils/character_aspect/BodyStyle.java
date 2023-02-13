public class BodyStyle {
    private String bodyStyle;
    private String skinTone;
    private float height;
    private float weight;
    private int muscleMass;
    private String bodyHair;
    private String tattoo;

    public BodyStyle(String bodyStyle, String skinTone, float height, float weight, int muscleMass, String bodyHair, String tattoo) {
        this.bodyStyle = bodyStyle;
        this.skinTone = skinTone;
        this.height = height;
        this.weight = weight;
        this.muscleMass = muscleMass;
        this.bodyHair = bodyHair;
        this.tattoo = tattoo;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public String getSkinTone() {
        return skinTone;
    }

    public void setSkinTone(String skinTone) {
        this.skinTone = skinTone;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getMuscleMass() {
        return muscleMass;
    }

    public void setMuscleMass(int muscleMass) {
        this.muscleMass = muscleMass;
    }

    public String getBodyHair() {
        return bodyHair;
    }

    public void setBodyHair(String bodyHair) {
        this.bodyHair = bodyHair;
    }

    public String getTattoo() {
        return tattoo;
    }

    public void setTattoo(String tattoo) {
        this.tattoo = tattoo;
    }
}
