/**
 * Created by H on 13/11/2022.
 */
public class h5_6 {
    public h5_6() {
    }

    public static void main(String[] args) {
        h5_5 c = new h5_5();
        System.out.println(c.getValue());
        c.click();
        c.click();
        c.click();
        System.out.println(c.getValue());
        
        c.reset();
        System.out.println(c.getValue());
    }
}
