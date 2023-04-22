package it.project1.character;

import jakarta.persistence.*;


@Entity
public class CharacterEntity {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	//TODO create a link between this entity and the account entity
	private int accountId;
	@Column
	private String name;
	@Column
	private int level;
	@Column
	private String job;
	@Column
	private char gender;
	
	public CharacterEntity() {
	}
	
	public CharacterEntity(int accountId, String name, int level, String job, char gender) {
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
