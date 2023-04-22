package it.project1.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/")
	public Account returnById(@RequestParam int id){
		return accountService.getAccountById(id);
	}
	@GetMapping("/findall")
	public List<Account> returnAccounts(){
		return accountService.getListOfAccounts();
	}
}