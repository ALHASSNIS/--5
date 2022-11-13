/**
 * Created by H on 13/11/2022.
 */
public class h5_3 {
    private double purchase = 0.0D;
    private double payment = 0.0D;

    public h5_3() {
    }

    public void recordP(double price) {
        this.purchase += price;
    }

    public void recieveP(double amount) {
        this.payment += amount;
    }

    public double giveChange() {
        double change = this.payment - this.purchase;
        this.payment = 0.0D;
        this.purchase = 0.0D;
        return change;
    }
}
