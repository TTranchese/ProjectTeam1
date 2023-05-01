package it.project1.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/")
	public Account returnById(@RequestParam int id) {
		return accountService.getAccountById(id);
	}
	
	@GetMapping("/findAll")
	public List<Account> returnAccounts() {
		return accountService.getListOfAccounts();
	}
	
	@PostMapping("/register")
	public void registerAccount(@RequestParam String nickName, @RequestParam String password) {
		accountService.postNewAccount(nickName, password);
	}

	@PutMapping("/changePassword")
	public void putPassword(@RequestParam int id, @RequestParam String oldPassword, @RequestParam String newPassword){
		accountService.putPassword(id, oldPassword, newPassword);
	}
	@PutMapping("/changeNickName")
	public void putPassword(@RequestParam int id, @RequestParam String newNickName){
		accountService.putNickName(id, newNickName);
	}
}

