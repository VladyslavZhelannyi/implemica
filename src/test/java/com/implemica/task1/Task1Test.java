package com.implemica.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static com.implemica.constants.IllegalInputConstants.NEGATIVE_BRACKETS_NUMBER;
import static com.implemica.task1.Task1TestData.*;

public class Task1Test {
    private final Task1 cut = new Task1();

    public static Arguments[] findNumBracketExpressionsTestArgs() {
        return new Arguments[] {
          Arguments.arguments(NUM_BRACKETS_1, BRACKETS_EXPECTED_1),
          Arguments.arguments(NUM_BRACKETS_2, BRACKETS_EXPECTED_2)
        };
    }

    @ParameterizedTest
    @MethodSource("findNumBracketExpressionsTestArgs")
    public void findNumBracketExpressionsTest(int bracketNum, int expected) {
        int actual = cut.findNumBracketExpressions(bracketNum);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findNumBracketExpressionsExceptionTest() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class,
                () -> cut.findNumBracketExpressions(NUM_BRACKETS_EXCEPTION));
        Assertions.assertEquals(NEGATIVE_BRACKETS_NUMBER, thrown.getMessage());
    }
}
