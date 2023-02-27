package it.project1.entities;

/**
 * TODO list of things commented
 * {@code @Account}
 * @author TTranchese
 */
public class Account {
	private String name;
	private String password;

	/**
	 * Constructor
	 * @param name
	 * @param password
	 */
	public Account(String name, String password) {
		this.name = name;
		this.password = password;
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
}
