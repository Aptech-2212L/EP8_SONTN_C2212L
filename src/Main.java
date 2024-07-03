import Entity.Account;
import Service.DepositThread;
import Service.WithDrawThread;

import java.io.IOError;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account("123", 100);

        WithDrawThread wd = new WithDrawThread(acc, 15);
        DepositThread dp = new DepositThread(acc, 5);

        Thread t1 = new Thread(wd);
        Thread t2 = new Thread(dp);

        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Your account balance is: " + dp.toString(":="));


    }
}