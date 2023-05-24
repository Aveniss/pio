package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer dziedziczy po klasie DefaultCountingOutRhymer
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * Stała INT_1
     */
    public static final int INT_1 = 0;
    /**
     * Zmienna przechwująca ilość odrzucań
     */
    int totalRejected = INT_1;

    /**
     * @return zwraca ilość odrzuceń
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * @param in - zmienna typu int która jest odkładana przez funkcję countIn na stos
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}