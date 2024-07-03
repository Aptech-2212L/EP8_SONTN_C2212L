package Service;

import Entity.Account;

public class WithDrawThread extends AccountService implements Runnable{
    private double amount;

    public WithDrawThread(Account account, double amount) {
        super(account);
        this.amount = amount;
    }

    @Override
    public void run() {
        withDraw(amount);
    }
}
