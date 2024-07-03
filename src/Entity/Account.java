package Entity;

public class Account {
    private String Id;
    private double balance;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account() {
    }

    public Account(String id, double balance) {
        Id = id;
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Account{" +
                "Id='" + Id + '\'' +
                ", balance=" + balance +
                '}';
    }
}
