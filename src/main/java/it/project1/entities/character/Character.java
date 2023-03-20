package it.project1.entities.character;

import it.project1.entities.character.character_aspect.CharacterAspect;

/**
 * {@code @Character}
 *
 * @author TTranchese
 */
public class Character {
	private String id;
	private String name;
	private CharacterAspect aspect;
	private int level;
	private String job;


	/**
	 * Constructor
	 *
	 * @param name
	 * @param aspect
	 * @param level
	 * @param job
	 */
	public Character(String id, String name, CharacterAspect aspect, int level, String job) {
		this.id = id;
		this.name = name;
		this.aspect = aspect;
		this.level = level;
		this.job = job;
	}

	//setter&getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CharacterAspect getAspect() {
		return aspect;
	}

	public void setAspect(CharacterAspect aspect) {
		this.aspect = aspect;
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


}
