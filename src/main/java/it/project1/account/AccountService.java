package it.project1.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
