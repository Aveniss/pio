package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

    private static final int MAX_SIZE  = 12;
    private static final int IS_EMPTY = -1;

    public static int getMaxSize() {
        return MAX_SIZE;
    }

    public static int getIsEmpty() {
        return IS_EMPTY;
    }

    public int getTotal() {
        return total;
    }

    private int total = IS_EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }


        public boolean callCheck() {
            return total == IS_EMPTY;
        }
        
            public boolean isFull() {
                return total == MAX_SIZE;
            }
        
                protected int peekaBoo() {
                    if (callCheck())
                        return IS_EMPTY;
                    return numbers[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return IS_EMPTY;
                        return numbers[total--];
                    }

}
