package it.project1.character;


public class Character {
    private int id;
    private int accountId;
    private String name;
    private int level;
    private String job;
    private char gender;
    private int skinStyle;
    private int hairStyle;
    private int eyesStyle;

    public Character(String name, int level, String job, char gender, int skinStyle, int hairStyle, int eyesStyle) {
        this.name = name;
        this.level = level;
        this.job = job;
        this.gender = gender;
        this.skinStyle = skinStyle;
        this.hairStyle = hairStyle;
        this.eyesStyle = eyesStyle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSkinStyle() {
        return skinStyle;
    }

    public void setSkinStyle(int skinStyle) {
        this.skinStyle = skinStyle;
    }

    public int getHairStyle() {
        return hairStyle;
    }

    public void setHairStyle(int hairStyle) {
        this.hairStyle = hairStyle;
    }

    public int getEyesStyle() {
        return eyesStyle;
    }

    public void setEyesStyle(int eyesStyle) {
        this.eyesStyle = eyesStyle;
    }
}
