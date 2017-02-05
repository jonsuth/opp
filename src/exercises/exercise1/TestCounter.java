package exercises.exercise1;

/**
 * Created by jss33 on 24/01/17.
 */
public class TestCounter {
    public static void main(String[] args) {
        Counter ctr = new Counter();
        ctr.increment();
        System.out.println(ctr.getValue());
        ctr.reset();
    }
}
