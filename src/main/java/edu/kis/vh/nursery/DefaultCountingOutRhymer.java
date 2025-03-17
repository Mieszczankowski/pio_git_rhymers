package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_SIZE = 12;
    public static final int TOTAL_COUNT = -1;
    private int[] _numbers = new int[NUMBERS_SIZE];

    public int totalCount = TOTAL_COUNT;

    public void countIn(int in) {
        if (!isFull())
            _numbers[++totalCount] = in;
    }

    public boolean callCheck() {
        return totalCount == TOTAL_COUNT;
    }

    public boolean isFull() {
        return totalCount == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return TOTAL_COUNT;
        return _numbers[totalCount];
    }

    public int countOut() {
        if (callCheck())
            return TOTAL_COUNT;
        return _numbers[totalCount--];
    }

}
