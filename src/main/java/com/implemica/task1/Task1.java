package com.implemica.task1;

import static com.implemica.constants.IllegalInputConstants.NEGATIVE_BRACKETS_NUMBER;

public class Task1 {
    public int findNumBracketExpressions(int bracketPairs) {
        //throw exception if bracketPairs < 0
        if (bracketPairs < 0) {
            throw new IllegalArgumentException(NEGATIVE_BRACKETS_NUMBER);
        }
        //create counter as a separate object in order to use it in method
        IntCounter counter = new IntCounter(0);
        considerBracketCases(bracketPairs, bracketPairs, counter);
        return counter.get();
    }

    public void considerBracketCases(int leftBracketNum, int rightBracketNum, IntCounter counter) {
        //consider all bracket cases: at every step we can use left bracket if we have the remaining one or right
        //bracket if the num of right brackets is higher than the num of left brackets or if there is the remaining one
        if (leftBracketNum == 0 && rightBracketNum == 0) {
            counter.increment();
        }
        if (leftBracketNum < rightBracketNum) {
            considerBracketCases(leftBracketNum, rightBracketNum - 1, counter);
        }
        if (leftBracketNum != 0) {
            considerBracketCases(leftBracketNum - 1, rightBracketNum, counter);
        }
    }

    private static class IntCounter {
        //object that encapsulates the counter
        private int counter;

        public IntCounter(int counter) {
            this.counter = counter;
        }

        public void increment() {
            counter++;
        }

        public int get() {
            return counter;
        }
    }
}
