package it.project1.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {
	@Autowired
	public AccountRepository accountRepository;
	
	public Account getAccountById(int id){
		return accountRepository.getById(id);
	}
	public List<Account> getListOfAccounts(){
		return accountRepository.findAll();
	}
	public void postNewAccount(String nickName, String password) {
		Account account = new Account();
		account.setNickName(nickName);
		account.setPassword(password);
		List<Account> accountList = accountRepository.findByNickName(nickName);
		if (accountList.isEmpty()){
			accountRepository.save(account);
			System.out.println("Account created!");
		} else {
			System.out.println("Nickname already in use!");
		}
		
	}
}
