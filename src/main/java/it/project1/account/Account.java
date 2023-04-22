package it.project1.account;


import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.Builder;
import org.springframework.boot.context.properties.bind.DefaultValue;


@Entity
@Table(name = "accounts")
public class Account{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String nickName;
	@Column
	private String password;
	
	public Account() {
	}
	
	public Account(int id, String nickName, String password) {
		this.id = id;
		this.nickName = nickName;
		this.password = password;
	}

	public String getName() {
		return nickName;
	}

	public void setName(String name) {
		this.nickName = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
