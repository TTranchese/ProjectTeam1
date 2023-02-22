package it.project1.entities;

import it.project1.utils.character_aspect.CharacterAspect;

/**
 * TODO list of things commented
 * {@code @Account}
 * @author Tommaso
 */
public class Character {
	private String name;
	private CharacterAspect aspect;
	private int level;
	private String job;
	private String personalInfos;//TODO change to a list of something or delete already
	//TODO list:
	//private Coordinates placeLastLogOut; //TODO create class Coordinates to know where the character is or last logged out
	//private List<Achievement> achievements;//TODO create class Achievement
	//private List<Chapter> completedChapters; //TODO create Chapter class where each Chapter is the chapter that the character has completed

	/**
	 * Constructor
	 * @param name
	 * @param aspect
	 * @param level
	 * @param job
	 * @param personalInfos
	 */
	public Character(String name, CharacterAspect aspect, int level, String job, String personalInfos) {
		this.name =name;
		this.aspect= aspect;
		this.level=level;
		this.job=job;
		this.personalInfos=personalInfos;
	}

	//setter&getter
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public CharacterAspect getAspect(){
		return aspect;
	}
	public void setAspect(CharacterAspect aspect){
		this.aspect=aspect;
	}
	public int getLevel(){
		return level;
	}
	public void setLevel(int level){
		this.level=level;
	}

	public String getJob(){
		return job;
	}
	public void setJob(String job){
		this.job = job;
	}

	public String getPersonalInfos(){
		return personalInfos;
	}
	public void setPersonalInfos(String personalInfos){
		this.personalInfos = personalInfos;
	}




}
