package com.implemica.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static com.implemica.task3.Task3TestData.*;

public class Task3Test {
    private final Task3 cut = new Task3();

    public static Arguments[] countDigitsSumInFactorialTestArgs() {
        return new Arguments[] {
                Arguments.arguments(NUM_TO_FACTORIAL_1, EXPECTED_1),
                Arguments.arguments(NUM_TO_FACTORIAL_2, EXPECTED_2)
        };
    }

    @ParameterizedTest
    @MethodSource("countDigitsSumInFactorialTestArgs")
    public void countDigitsSumInFactorialTest(int numToFactorial, int expected) {
        int actual = cut.countDigitsSumInFactorial(numToFactorial);
        Assertions.assertEquals(expected, actual);
    }
}
