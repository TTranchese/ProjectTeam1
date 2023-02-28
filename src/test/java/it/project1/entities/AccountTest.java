package it.project1.entities;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
	private List<Account> accounts;

	public AccountTest(){
		accounts = new ArrayList<>();
		try(BufferedReader reader = new BufferedReader(new FileReader("src/main/java/it/project1/db/databaseAccounts.json"))){
			String line;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine())!= null){
				sb.append(line);
			}
			JSONArray jsonArray  = new JSONArray(sb.toString());
			for (int i = 0; i<jsonArray.length(); i++){
				JSONObject jsonObject = jsonArray.getJSONObject(i);
				String accountId = jsonObject.getString("accountId");
				String password = jsonObject.getString("password");
				accounts.add(new Account(accountId, password));
			}
		}catch (IOException e){
			e.printStackTrace();
		}
	}

	private Account findAccount(String accountId){
		for (Account account: accounts){
			if (account.getName().equals(accountId)){
				return account;
			}
		}
		return null;
	}

	@Test
	public void testAccountExists(){
		Account account = findAccount("tommaso");
		assertNotNull(account);
	}



}