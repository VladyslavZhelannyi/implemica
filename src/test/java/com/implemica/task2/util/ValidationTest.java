package com.implemica.task2.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static com.implemica.constants.ValidationConstants.*;
import static com.implemica.task2.util.ValidationTestData.*;

public class ValidationTest {
    private final Validation cut = new Validation();

    public static Arguments[] validateCityNameTestArgs() {
        return new Arguments[] {
                Arguments.arguments(CITY_NAME_1),
                Arguments.arguments(CITY_NAME_2),
                Arguments.arguments(CITY_NAME_3),
        };
    }

    @ParameterizedTest
    @MethodSource("validateCityNameTestArgs")
    public void validateCityNameTest(String cityName) {
        cut.validateCityName(cityName);
    }

    public static Arguments[] validateNumOfTestsTestArgs() {
        return new Arguments[] {
                Arguments.arguments(TEST_NUM_1),
                Arguments.arguments(TEST_NUM_2),
                Arguments.arguments(TEST_NUM_3)
        };
    }

    @ParameterizedTest
    @MethodSource("validateNumOfTestsTestArgs")
    public void validateNumOfTestsTest(int testsNum) {
        cut.validateNumOfTests(testsNum);
    }

    public static Arguments[] validateNumOfCitiesTestArgs() {
        return new Arguments[] {
                Arguments.arguments(CITIES_NUM_1),
                Arguments.arguments(CITIES_NUM_2),
                Arguments.arguments(CITIES_NUM_3)
        };
    }

    @ParameterizedTest
    @MethodSource("validateNumOfCitiesTestArgs")
    public void validateNumOfCitiesTest(int citiesNum) {
        cut.validateNumOfCities(citiesNum);
    }

    public static Arguments[] validateNumOfPathsTestArgs() {
        return new Arguments[] {
                Arguments.arguments(PATHS_NUM_1),
                Arguments.arguments(PATHS_NUM_2),
                Arguments.arguments(PATHS_NUM_3)
        };
    }

    @ParameterizedTest
    @MethodSource("validateNumOfPathsTestArgs")
    public void validateNumOfPathsTest(int pathsNum) {
        cut.validateNumOfPaths(pathsNum);
    }

    public static Arguments[] validateCityNameExceptionTestArgs() {
        return new Arguments[] {
                Arguments.arguments(WRONG_CITY_NAME_1),
                Arguments.arguments(WRONG_CITY_NAME_2),
                Arguments.arguments(WRONG_CITY_NAME_3)
        };
    }

    @ParameterizedTest
    @MethodSource("validateCityNameExceptionTestArgs")
    public void validateCityNameExceptionTest(String cityName) {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class,
                () -> cut.validateCityName(cityName));
        Assertions.assertEquals(String.format(WRONG_CITY_NAME, cityName), thrown.getMessage());
    }

    public static Arguments[] validateNumOfTestsExceptionTestArgs() {
        return new Arguments[] {
                Arguments.arguments(WRONG_TEST_NUM_1),
                Arguments.arguments(WRONG_TEST_NUM_2)
        };
    }

    @ParameterizedTest
    @MethodSource("validateNumOfTestsExceptionTestArgs")
    public void validateNumOfTestsExceptionTest(int testsNum) {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class,
                () -> cut.validateNumOfTests(testsNum));
        Assertions.assertEquals(String.format(UNACCEPTABLE_TESTS_NUM, testsNum), thrown.getMessage());
    }

    public static Arguments[] validateNumOfCitiesExceptionTestArgs() {
        return new Arguments[] {
                Arguments.arguments(WRONG_CITIES_NUM_1),
                Arguments.arguments(WRONG_CITIES_NUM_2)
        };
    }

    @ParameterizedTest
    @MethodSource("validateNumOfCitiesExceptionTestArgs")
    public void validateNumOfCitiesExceptionTest(int citiesNum) {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class,
                () -> cut.validateNumOfCities(citiesNum));
        Assertions.assertEquals(String.format(UNACCEPTABLE_CITIES_NUM, citiesNum), thrown.getMessage());
    }

    public static Arguments[] validateNumOfPathsTestExceptionArgs() {
        return new Arguments[] {
                Arguments.arguments(WRONG_PATHS_NUM_1),
                Arguments.arguments(WRONG_PATHS_NUM_2)
        };
    }

    @ParameterizedTest
    @MethodSource("validateNumOfPathsTestExceptionArgs")
    public void validateNumOfPathsExceptionTest(int pathsNum) {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class,
                () -> cut.validateNumOfPaths(pathsNum));
        Assertions.assertEquals(String.format(UNACCEPTABLE_PATHS_NUM, pathsNum), thrown.getMessage());
    }
}
