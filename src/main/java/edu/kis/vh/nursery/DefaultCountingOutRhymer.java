package edu.kis.vh.nursery;

/**
 * Klasa reprezentująca licznik oparty na tablicy, która obsługuje operacje w stylu stosu.
 * Działa na zasadzie przechowywania liczb w tablicy o stałej wielkości i umożliwia dodawanie (countIn) oraz usuwanie (countOut) liczb.
 *
 * Metody:
 * - countIn(in) - dodaje liczbę do licznika (jeśli nie jest pełny),
 * - countOut() - usuwa liczbę z licznika i zwraca ją,
 * - peekaboo() - zwraca liczbę na szczycie licznika bez jej usuwania,
 * - callCheck() - sprawdza, czy licznik jest pusty,
 * - isFull() - sprawdza, czy licznik jest pełny.
 */

public class DefaultCountingOutRhymer {

    private static final int NUMBERS_SIZE = 12;
    private static final int EMPTY_RHYMER = -1;
    private static final int DEFAULT_RETURN_VALUE = -1;
    final private int[] _numbers = new int[NUMBERS_SIZE];

    private int totalCount = EMPTY_RHYMER;

    public int getTotalCount() {
        return totalCount;
    }

    public void countIn(int in) {
        if (!isFull())
            _numbers[++totalCount] = in;
    }

    public boolean callCheck() {
        return totalCount == EMPTY_RHYMER;
    }

    public boolean isFull() {
        return totalCount == NUMBERS_SIZE-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return _numbers[totalCount];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return _numbers[totalCount--];
    }

}
