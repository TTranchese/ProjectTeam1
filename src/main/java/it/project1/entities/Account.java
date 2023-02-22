package it.project1.entities;

import it.project1.utils.CharacterSystemManaging;


public class Account {
	private String name;
	private String password;
	private CharacterSystemManaging characterList;

	/**
	 * Constructor
	 * @param name
	 * @param password
	 * @param characterList
	 */
	public Account(String name, String password, CharacterSystemManaging characterList) {
		this.name = name;
		this.password = password;
		this.characterList = characterList;
	}
	//Setter and Getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public CharacterSystemManaging getCharacterList() {
		return characterList;
	}

	public void setCharacterList(CharacterSystemManaging characterList) {
		this.characterList = characterList;
	}
}
