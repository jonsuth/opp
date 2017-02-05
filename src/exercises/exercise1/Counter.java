package exercises.exercise1;

/**
 * Created by jss33 on 24/01/17.
 */
public class Counter {
    private int count;

    public Counter(int initialCount) {
        count = initialCount;
    }

    public Counter() {
        count = 0;
    }

    public void increment() {
        count += 1;
    }

    public void reset() {
        count = 0;
    }

    public int getValue() {
        return count;
    }
}