package it.project1.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@GetMapping
	public ResponseEntity<Account> getById(@RequestParam int id) {
		return accountService.findById(id);
	}
	
	@GetMapping("/find-all")
	public ResponseEntity<List<Account>> getAll() {
		return accountService.findAll();
	}
	
	@PostMapping("/register")
	public ResponseEntity<Account> postNewAccount(@RequestParam String nickName, @RequestParam String password) {
		return accountService.postNewAccount(nickName, password);
	}
	
	@PutMapping("/changePassword")
	public ResponseEntity<Account> putPassword(@RequestParam int id, @RequestParam String oldPassword, @RequestParam String newPassword) {
		return accountService.putPassword(id, oldPassword, newPassword);
	}
	
	@PutMapping("/changeNickName")
	public ResponseEntity<Account> putNickName(@RequestParam int id, @RequestParam String newNickName) {
		return accountService.putNickName(id, newNickName);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Account> delAccount(@RequestParam int id, @RequestParam String password) {
		return accountService.delAccount(id, password);
	}
}

