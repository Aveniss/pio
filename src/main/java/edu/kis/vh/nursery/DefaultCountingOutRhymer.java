package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MEDIUM_CAPACITY = 11;

    private static final int NEGATIVE_VALUE = -1;
    private static final int NEGATIVE_VALUE_1 = -1;
    private static final int CAPACITY = 12;
    private final int[] NUMBERS = new int[CAPACITY];

    private int total = NEGATIVE_VALUE_1;

    protected int getTotal() {
        return total;
    }

    protected void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    protected boolean callCheck() {
        return total == NEGATIVE_VALUE_1;
    }
    protected boolean isFull() {
        return total == MEDIUM_CAPACITY;
    }

    protected int peekaboo() {
        if (callCheck())
                   return NEGATIVE_VALUE;
        return NUMBERS[total];
    }



    protected int countOut() {
        if (callCheck())
            return NEGATIVE_VALUE;
        return NUMBERS[total--];
    }


}