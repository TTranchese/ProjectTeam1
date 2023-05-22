package it.project1.character;

import it.project1.account.Account;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "characters")
public class Character {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "account_id")
	private Account accountId;
	@Column(unique = true, nullable = false)
	private String name;
	@Column(nullable = false)
	private int c_level;
	@Column(nullable = false)
	private String job;
	@Column(nullable = false)
	private char gender;
	
}
