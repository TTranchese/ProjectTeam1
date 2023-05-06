package it.project1.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AccountService {
	@Autowired
	public AccountRepository accountRepository;
	
	public AccountEntity getAccountById(int id) {
		return accountRepository.findById(id);
	}
	
	public List<AccountEntity> getListOfAccounts() {
		return accountRepository.findAll();
	}
	
	public void postNewAccount(String nickName, String password) {
		AccountEntity accountEntity = new AccountEntity();
		accountEntity.setNickName(nickName);
		accountEntity.setPassword(password);
		List<AccountEntity> accountEntityList = accountRepository.findByNickName(nickName);
		if (accountEntityList.isEmpty()) {
			accountRepository.save(accountEntity);
			System.out.println("AccountEntity created!");
		} else {
			System.out.println("Nickname already in use!");
		}
		
	}
	
	public void putPassword(int id, String oldPassword, String newPassword) {
		AccountEntity accountEntity = getAccountById(id);
		if (accountEntity.getPassword().equals(oldPassword)) {
			accountEntity.setPassword(newPassword);
			accountRepository.save(accountEntity);
		} else {
			System.out.println("Incorrect old password!");
		}
		
	}
	
	public void putNickName(int id, String newNickName) {
		AccountEntity accountEntity = getAccountById(id);
		if (accountRepository.findByNickName(newNickName).isEmpty()) {
			accountEntity.setNickName(newNickName);
			accountRepository.save(accountEntity);
		} else {
			System.out.println("Nickname already in use!");
		}
	}
	
	public void delAccount(int id, String password) {
		AccountEntity accountEntity = accountRepository.findById(id);
		if (accountEntity == null) {
			System.out.println("The accountEntity doesn't exist!");
		} else if (accountEntity.getPassword().equals(password)) {
			accountRepository.delete(accountEntity);
		} else {
			System.out.println("Password not matching!");
		}
	}
}
