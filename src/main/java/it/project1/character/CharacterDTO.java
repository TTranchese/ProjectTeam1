package it.project1.character;

import it.project1.account.AccountDTO;
import it.project1.inventory.InventoryDTO;

public class CharacterDTO {

    private int id;
    private AccountDTO account;
    private InventoryDTO inventory;
    private String name;
    private int level;
    private String job;
    private char gender;

    public CharacterDTO() {
    }

    public CharacterDTO(int id, AccountDTO account, InventoryDTO inventory, String name, int level, String job, char gender) {
        this.id = id;
        this.account = account;
        this.inventory = inventory;
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

    public AccountDTO getAccount() {
        return account;
    }

    public void setAccount(AccountDTO account) {
        this.account = account;
    }

    public InventoryDTO getInventory() {
        return inventory;
    }

    public void setInventory(InventoryDTO inventory) {
        this.inventory = inventory;
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
