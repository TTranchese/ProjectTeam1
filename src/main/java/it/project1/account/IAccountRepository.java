package it.project1.account;

public interface IAccountRepository {
    public Account findAccount();
    public void insertAccount();
    public void deleteAccount();
    public void updateAccountName();
    public void updateAccountPassword();
}
