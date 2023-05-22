package it.project1.character;
//?? quale si dovrebbe inserire tra le due?
/*
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

 */
public class CharacterDTO {
    private int id;
    private int accountId;
    private String name;
    private int level;
    private String job;
    private char gender;
    private double healthPoint;
    private double manaPoint;
    private int attackDamage;
    private int magicDamage;
    private int armorRes;
    private int magicRes;

    public CharacterDTO() {
    }

    public CharacterDTO(int id, int accountId, String name, int level, String job, char gender, double healthPoint, double manaPoint, int attackDamage, int magicDamage, int armorRes, int magicRes) {
        this.id = id;
        this.accountId = accountId;
        this.name = name;
        this.level = level;
        this.job = job;
        this.gender = gender;
        this.healthPoint = healthPoint;
        this.manaPoint = manaPoint;
        this.attackDamage = attackDamage;
        this.magicDamage = magicDamage;
        this.armorRes = armorRes;
        this.magicRes = magicRes;
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

    public double getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(double healthPoint) {
        this.healthPoint = healthPoint;
    }

    public double getManaPoint() {
        return manaPoint;
    }

    public void setManaPoint(double manaPoint) {
        this.manaPoint = manaPoint;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getMagicDamage() {
        return magicDamage;
    }

    public void setMagicDamage(int magicDamage) {
        this.magicDamage = magicDamage;
    }

    public int getArmorRes() {
        return armorRes;
    }

    public void setArmorRes(int armorRes) {
        this.armorRes = armorRes;
    }

    public int getMagicRes() {
        return magicRes;
    }

    public void setMagicRes(int magicRes) {
        this.magicRes = magicRes;
    }
}
