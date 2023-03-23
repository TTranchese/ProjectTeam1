package it.project1.account;

public class AccountService {
    private AccountEntity account;

    private void setAccount(AccountEntity account){
        this.account=account;
    }
    public AccountEntity getAccount(){
        return account;
    }


}
