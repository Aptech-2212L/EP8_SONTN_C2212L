package Service;

import Entity.Account;

public class DepositThread extends AccountService implements Runnable {
    private double amount;

    public DepositThread(Account account, double amount) {
        super(account);
        this.amount = amount;
    }

    @Override
    public void run() {
        deposit(amount);
    }
}
