package it.project1.character;

import jakarta.persistence.*;


@Entity
@Table(name = "characters")
public class CharacterEntity {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	//TODO create a link between this entity and the account entity
	private int accountId;
	@Column
	private String name;
	@Column
	private int c_level;
	@Column
	private String job;
	@Column
	private char gender;
	
	public CharacterEntity() {
	}
	
	public CharacterEntity(int accountId, String name, int c_level, String job, char gender) {
		this.accountId = accountId;
		this.name = name;
		this.c_level = c_level;
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
	
	public int getCLevel() {
		return c_level;
	}
	
	public void setCLevel(int level) {
		this.c_level = level;
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
