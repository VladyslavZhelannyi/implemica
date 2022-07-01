package com.implemica.task3;

import com.google.common.math.BigIntegerMath;
import java.math.BigInteger;

public class Task3 {
    public int countDigitsSumInFactorial(int numToFactorial) {
        //BigIntegerMath.factorial(..) is an optimized method from guava library
        BigInteger factorial = BigIntegerMath.factorial(numToFactorial);
        return countDigitsSum(factorial);
    }

    private int countDigitsSum(BigInteger bigInteger) {
        //in order to count the sum of digits in BigInteger it`s faster to turn it to String and count digits as chars
        //cast to int
        String stringNumber = bigInteger.toString();
        int sum = 0;
        for (int i = 0; i < stringNumber.length(); i++) {
            int digit = stringNumber.charAt(i) - '0';
            sum += digit;
        }
        return sum;
    }
}
