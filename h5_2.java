/**
 * Created by H on 13/11/2022.
 */
public class h5_2 {
    public h5_2() {
    }

    public static void main(String[] args) {
        h5_1 account = new h5_1(400.0D);
        System.out.println(account.getBalance());
        account.deposit(100.0D);
        account.deposit(200.0D);
        System.out.println(account.getBalance());
        account.withdraw(20.0D);
        System.out.println(account.getBalance());
    }
}
