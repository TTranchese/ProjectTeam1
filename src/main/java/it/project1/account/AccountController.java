package it.project1.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/")
	public AccountEntity returnById(@RequestParam int id) {
		return accountService.getAccountById(id);
	}
	
	@GetMapping("/findAll")
	public List<AccountEntity> returnAccounts() {
		return accountService.getListOfAccounts();
	}
	
	@PostMapping("/register")
	public void registerAccount(@RequestParam String nickName, @RequestParam String password) {
		accountService.postNewAccount(nickName, password);
	}
	
	@PutMapping("/changePassword")
	public void putPassword(@RequestParam int id, @RequestParam String oldPassword, @RequestParam String newPassword) {
		accountService.putPassword(id, oldPassword, newPassword);
	}
	
	@PutMapping("/changeNickName")
	public void putPassword(@RequestParam int id, @RequestParam String newNickName) {
		accountService.putNickName(id, newNickName);
	}
	
	@DeleteMapping("/delete")
	public void delAccount(@RequestParam int id, @RequestParam String password) {
		accountService.delAccount(id, password);
	}
}

