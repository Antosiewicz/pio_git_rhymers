package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private static final int EMPTY_NUMBERS_INDICATOR = -1;
    private static final int RETURN_VALUE = -1;

    private final int[] numbers = new int[MAX_SIZE];

    private int total = EMPTY_NUMBERS_INDICATOR;

    public int getTotal() {
        return total;
    }
    
    public static int getMaxSize() {
        return MAX_SIZE;
    }

    public static int getEmptyNumbersIndicator() {
        return EMPTY_NUMBERS_INDICATOR;
    }

    public static int getReturnValue() {
        return RETURN_VALUE;
    }

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

    public int[] getNumbers() {
        return numbers;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
