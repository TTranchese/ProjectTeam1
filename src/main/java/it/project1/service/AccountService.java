package it.project1.service;

import it.project1.entities.Account;
import it.project1.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
	@Autowired
	public AccountRepository accountRepository;
	
	public ResponseEntity<Account> findById(int id) {
		Optional<Account> optionalAccountEntity = accountRepository.findById(id);
		if (optionalAccountEntity.isEmpty()){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else{
			Account account = optionalAccountEntity.get();
			return new ResponseEntity<>(account, HttpStatus.FOUND);
		}
	}
	
	public ResponseEntity<List<Account>> findAll() {
		return new ResponseEntity<>(accountRepository.findAll(), HttpStatus.FOUND);
	}
	
	public ResponseEntity<Account> postNewAccount(String nickName, String password) {
		Account account = new Account();
		account.setNickName(nickName);
		account.setPassword(password);
		List<Account> accountList = accountRepository.findByNickName(nickName);
		if (accountList.isEmpty()) {
			accountRepository.save(account);
			return new ResponseEntity<>(account, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(account, HttpStatus.NOT_ACCEPTABLE);
		}
		
	}
	
	public ResponseEntity<Account> putPassword(int id, String oldPassword, String newPassword) {
		Optional<Account> optionalAccountEntity = accountRepository.findById(id);
		if (optionalAccountEntity.isEmpty()){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			Account account = optionalAccountEntity.get();
			if(account.getPassword().equals(oldPassword)){
				account.setPassword(newPassword);
				accountRepository.save(account);
				return new ResponseEntity<>(account, HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
			}
		}
		
	}
	
	public ResponseEntity<Account> putNickName(int id, String newNickName) {
		Optional<Account> optionalAccountEntity = accountRepository.findById(id);
		if (optionalAccountEntity.isEmpty()){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else if(!accountRepository.findByNickName(newNickName).isEmpty()){
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		} else {
			Account account = optionalAccountEntity.get();
			account.setNickName(newNickName);
			accountRepository.save(account);
			return new ResponseEntity<>(account, HttpStatus.OK);
		}
	}
	
	public ResponseEntity<Account> delAccount(int id, String password) {
		Optional<Account> optionalAccountEntity = accountRepository.findById(id);
		if (optionalAccountEntity.isEmpty()){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			Account account = optionalAccountEntity.get();
			if (!account.getPassword().equals(password)){
				return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
			} else {
				accountRepository.deleteById(id);
				return new ResponseEntity<>(account, HttpStatus.OK);
			}
		}
	}
}
