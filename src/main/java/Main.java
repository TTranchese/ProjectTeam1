import it.project1.entities.Account;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static ArrayList<Account> accounts = new ArrayList<>();
	public static Account loggedAccount = new Account();

	public static void loadAccountDb() {
		System.out.println("Loading account database");
		try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/it/project1/db/databaseAccounts.json"))) {
			String line;
			StringBuilder sb = new StringBuilder();
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
			JSONArray jsonArray = new JSONArray(sb.toString());
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonObject = jsonArray.getJSONObject(i);
				String id = jsonObject.getString("id");
				String name = jsonObject.getString("name");
				String password = jsonObject.getString("password");
				accounts.add(new Account(id, name, password));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void logInAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nickname: ");
		String name = sc.next();
		System.out.println("Password: ");
		String password = sc.next();
		for (Account account : accounts) {
			if (account.getName().equals(name) && account.getPassword().equals(password)) {
				loggedAccount = new Account(account.getId(), account.getName(), account.getPassword());
			}
		}
	}

	public static void main(String[] args) {
		loadAccountDb();
		logInAccount();
	}
}
