/**
 * Created by H on 13/11/2022.
 */
public class h5_5 {
    private int value = 0;

    public h5_5() {
    }

    public void click() {
        ++this.value;
    }

    public int getValue() {
        return this.value;
    }

    public void reset() {
        this.value = 0;
    }
}
