package it.project1.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AccountService {
	@Autowired
	public AccountRepository accountRepository;
	
	public Account getAccountById(int id) {
		return accountRepository.findById(id);
	}
	
	public List<Account> getListOfAccounts() {
		return accountRepository.findAll();
	}
	
	public void postNewAccount(String nickName, String password) {
		Account account = new Account();
		account.setNickName(nickName);
		account.setPassword(password);
		List<Account> accountList = accountRepository.findByNickName(nickName);
		if (accountList.isEmpty()) {
			accountRepository.save(account);
			System.out.println("Account created!");
		} else {
			System.out.println("Nickname already in use!");
		}
		
	}
	
	public void putPassword(int id, String oldPassword, String newPassword) {
		Account account = getAccountById(id);
		if (account.getPassword().equals(oldPassword)) {
			account.setPassword(newPassword);
			accountRepository.save(account);
		} else {
			System.out.println("Incorrect old password!");
		}
		
	}
	
	public void putNickName(int id, String newNickName) {
		Account account = getAccountById(id);
		if (accountRepository.findByNickName(newNickName).isEmpty()) {
			account.setNickName(newNickName);
			accountRepository.save(account);
		} else {
			System.out.println("Nickname already in use!");
		}
	}
	
	public void delAccount(int id, String password) {
		Account account = accountRepository.findById(id);
		if (account == null) {
			System.out.println("The account doesn't exist!");
		} else if (account.getPassword().equals(password)) {
			accountRepository.delete(account);
		} else {
			System.out.println("Password not matching!");
		}
	}
}
