package it.project1.character.character_aspect;

public class HairStyle {
    private String hairType;
    private int lenght;
    private String hairColor;

    public HairStyle(String hairType, int lenght, String hairColor) {
        this.hairType = hairType;
        this.lenght = lenght;
        this.hairColor = hairColor;
    }

    public String getHairType() {
        return hairType;
    }

    public void setHairType(String hairType) {
        this.hairType = hairType;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
