package Service;

import Entity.Account;

public class AccountService {
    private Account account;

    public AccountService(Account account) {
        this.account = account;
    }

    public synchronized Account withDraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        return account;
    }

    public synchronized Account deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        return account;
    }

    public String toString(String separator) {
        StringBuilder sb = new StringBuilder();
        return  sb.append(this.account.getId())
                .append(separator)
                .append(this.account.getBalance())
                .toString();
    }
}
