package it.project1;

import it.project1.account.Account;
import it.project1.account.AccountRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;


public class AccountTest {
	@Test
	void testIfAccountExists(){
		Account account = new Account(1, "DragonSlayer77", "password1");
		AccountRepository accountRepository = new AccountRepository();
		boolean checkIfExists = accountRepository.findAccount(account);
		Assertions.assertTrue(checkIfExists);
	}

	@Test
	void testIfAccountDoesntExist(){
		Account account = new Account(1, "CiccioPasticcio", "password1");
		AccountRepository accountRepository = new AccountRepository();
		boolean checkIfDoesntExists = accountRepository.findAccount(account);
		Assertions.assertFalse(checkIfDoesntExists);
	}

}