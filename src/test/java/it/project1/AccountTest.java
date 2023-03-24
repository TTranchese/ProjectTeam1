package it.project1;

import it.project1.account.Account;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;


public class AccountTest {
    @Test
    public void testToVerifyIfAccountExistsOrNot() {
        Account accountToVerify = new Account(1, "DragonSlayer77", "password1");
        Account accountToCompare = accountToVerify.findAccount();
        Assert.assertEquals(accountToVerify, accountToCompare);
    }
}