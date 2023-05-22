package it.project1.character;

public class CharacterDTO {
    private int id;
    private int accountId;
    private String name;
    private int level;
    private String job;
    private char gender;

    public CharacterDTO() {
    }

    public CharacterDTO(int id, int accountId, String name, int level, String job, char gender) {
        this.id = id;
        this.accountId = accountId;
        this.name = name;
        this.level = level;
        this.job = job;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
