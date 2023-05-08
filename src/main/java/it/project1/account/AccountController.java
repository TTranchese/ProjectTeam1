package it.project1.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@GetMapping
	public ResponseEntity<AccountEntity> getById(@RequestParam int id) {
		return accountService.findById(id);
	}
	
	@GetMapping("/find-all")
	public ResponseEntity<List<AccountEntity>> getAll() {
		return accountService.findAll();
	}
	
	@PostMapping("/register")
	public ResponseEntity<AccountEntity> postNewAccount(@RequestParam String nickName, @RequestParam String password) {
		return accountService.postNewAccount(nickName, password);
	}
	
	@PutMapping("/changePassword")
	public ResponseEntity<AccountEntity> putPassword(@RequestParam int id, @RequestParam String oldPassword, @RequestParam String newPassword) {
		return accountService.putPassword(id, oldPassword, newPassword);
	}
	
	@PutMapping("/changeNickName")
	public ResponseEntity<AccountEntity> putNickName(@RequestParam int id, @RequestParam String newNickName) {
		return accountService.putNickName(id, newNickName);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<AccountEntity> delAccount(@RequestParam int id, @RequestParam String password) {
		return accountService.delAccount(id, password);
	}
}

