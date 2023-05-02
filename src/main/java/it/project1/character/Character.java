package it.project1.character;


public class Character {
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
	
	
	public Character(String name, int level, String job, char gender) {
		this.name = name;
		this.level = level;
		this.job = job;
		this.gender = gender;
		if (job.equals("Tank")) {
			this.healthPoint = (level * 1.2) * 100;
			this.manaPoint = (level * 0.5) * 10;
			this.attackDamage = (int) ((level * 0.6) * 10);
			this.magicDamage = (int) ((level * 0.3) * 10);
			this.armorRes = (int) ((level * 1.1) * 10);
			this.magicRes = (int) ((level * 1.1) * 10);
		}
		if (job.equals("Warrior")) {
			this.healthPoint = level * 100;
			this.manaPoint = (level * 0.7) * 10;
			this.attackDamage = (int) ((level * 1.1) * 10);
			this.magicDamage = (int) ((level * 0.3) * 10);
			this.armorRes = (int) ((level * 0.5) * 10);
			this.magicRes = (int) ((level * 0.5) * 10);
		}
		if (job.equals("Mage")) {
			this.healthPoint = (level * 0.8) * 100;
			this.manaPoint = (level * 1.1) * 10;
			this.attackDamage = (int) ((level * 0.3) * 10);
			this.magicDamage = (int) ((level * 1.1) * 10);
			this.armorRes = (int) ((level * 0.5) * 10);
			this.magicRes = (int) ((level * 0.5) * 10);
		}
		
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
