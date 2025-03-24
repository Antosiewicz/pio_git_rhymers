package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static int MAX_SIZE = 12;
    private static int EMPTY_NUMBERS_INDICATOR = -1;
    private static int RETURN_VALUE = -1;

    private final int[] numbers = new int[MAX_SIZE];

    public int total = EMPTY_NUMBERS_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_NUMBERS_INDICATOR;
    }

    public boolean isFull() {
        return total == MAX_SIZE - 1;
    }

    protected int peek() {
        if (callCheck())
            return RETURN_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN_VALUE;
        return numbers[total--];
    }

}
