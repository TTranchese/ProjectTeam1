package it.project1;

import it.project1.account.AccountRepository;

public class Main {
	public static void main(String[] args) {
		AccountRepository accountRepository = new AccountRepository();
		accountRepository.createNewAccount("DragonSlayer77", "password2");
	}
}
