package it.project1.entities;

import java.util.List;
import java.util.Scanner;

/**
 * TODO list of things commented
 * {@code @Account}
 *
 * @author TTranchese
 */
public class Account {
	private String id;
	private String name;
	private String password;
	private List<Character> characterList;

	public Account() {}

	public Account(String id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
		//TODO setup the characterlist trough a function that retrieves the characters
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void resetPassword() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Current password: ");
		String oldPassword = sc.next();
		if (this.password.equals(oldPassword)) {
			System.out.println("New password: ");
			this.password = sc.next();
		} else {
			System.out.println("Wrong password.");
		}
	}

	//TODO Create a function to retrieve the list of the Characters that belongs to the account based on the id
}
