/**
 * Created by H on 13/11/2022.
 */
public class h5_1 {
    private double balance;

    public h5_1() {
        this.balance = 0.0;
    }

    public h5_1(double initBalance) {
        this.balance = initBalance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double balance) {
        this.balance -= balance;
    }

    public double getBalance() {
        return this.balance;
    }
}
