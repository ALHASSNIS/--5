/**
 * Created by H on 13/11/2022.
 */
public class h5_4 {
    public h5_4() {
    }

    public static void main(String[] args) {
        h5_3 x = new h5_3();
        System.out.println(x.giveChange());
        x.recordP(100);
        x.recordP(300);
        x.recordP(400);
        x.recieveP(750);
        x.recieveP(100);
        System.out.println(x.giveChange());
        System.out.println(x.giveChange());
    }
}
