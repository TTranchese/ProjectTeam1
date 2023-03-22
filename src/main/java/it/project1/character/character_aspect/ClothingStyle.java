package it.project1.character.character_aspect;

public class ClothingStyle {
    private String clothStyle;
    private String clothColor;
    private String accessory;

    public ClothingStyle(String clothStyle, String clothColor, String accessory) {
        this.clothStyle = clothStyle;
        this.clothColor = clothColor;
        this.accessory = accessory;
    }



    public String getClothStyle() {
        return clothStyle;
    }

    public void setClothStyle(String clothStyle) {
        this.clothStyle = clothStyle;
    }

    public String getClothColor() {
        return clothColor;
    }

    public void setClothColor(String clothColor) {
        this.clothColor = clothColor;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }
}
