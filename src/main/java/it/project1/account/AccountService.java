package it.project1.account;

import org.apache.coyote.Response;
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
	
	public ResponseEntity<AccountEntity> findById(int id) {
		return new ResponseEntity<>(accountRepository.findById(id).get(), HttpStatus.FOUND);
	}
	
	public ResponseEntity<List<AccountEntity>> findAll() {
		return new ResponseEntity<>(accountRepository.findAll(), HttpStatus.FOUND);
	}
	
	public ResponseEntity<AccountEntity> postNewAccount(String nickName, String password) {
		AccountEntity accountEntity = new AccountEntity();
		accountEntity.setNickName(nickName);
		accountEntity.setPassword(password);
		Optional<List<AccountEntity>> accountEntityList = accountRepository.findByNickName(nickName);
		if (accountEntityList.isEmpty()) {
			accountRepository.save(accountEntity);
			return new ResponseEntity<>(accountEntity, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(accountEntity, HttpStatus.NOT_ACCEPTABLE);
		}
		
	}
	
	public ResponseEntity<AccountEntity> putPassword(int id, String oldPassword, String newPassword) {
		Optional<AccountEntity> optionalAccountEntity = accountRepository.findById(id);
		if (optionalAccountEntity.isPresent()){
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		} else {
			AccountEntity accountEntity = optionalAccountEntity.get();
			accountEntity.setPassword(newPassword);
			accountRepository.save(accountEntity);
			return new ResponseEntity<>(accountEntity, HttpStatus.OK);
		}
	}
	
	public ResponseEntity<AccountEntity> putNickName(int id, String newNickName) {
		Optional<AccountEntity> optionalAccountEntity = accountRepository.findById(id);
		if (optionalAccountEntity.isEmpty()){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else if(accountRepository.findByNickName(newNickName).isPresent()){
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		} else {
			AccountEntity accountEntity = optionalAccountEntity.get();
			accountEntity.setNickName(newNickName);
			accountRepository.save(accountEntity);
			return new ResponseEntity<>(accountEntity, HttpStatus.OK);
		}
	}
	
	public ResponseEntity<AccountEntity> delAccount(int id, String password) {
		Optional<AccountEntity> optionalAccountEntity = accountRepository.findById(id);
		if (optionalAccountEntity.isEmpty()){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			AccountEntity accountEntity = optionalAccountEntity.get();
			if (!accountEntity.getPassword().equals(password)){
				return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
			} else {
				accountRepository.deleteById(id);
				return new ResponseEntity<>(accountEntity, HttpStatus.OK);
			}
		}
	}
}
