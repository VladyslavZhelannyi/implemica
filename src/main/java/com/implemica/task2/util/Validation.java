package com.implemica.task2.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static com.implemica.constants.ValidationConstants.*;

public class Validation { //class for validating values that have certain restrictions
    public void validateCityName(String cityName) {
        Pattern pattern = Pattern.compile(CITY_NAME_PATTERN);
        Matcher matcher = pattern.matcher(cityName);
        boolean isValid = matcher.matches();
        if (!isValid) {
            throw new IllegalArgumentException(String.format(WRONG_CITY_NAME, cityName));
        }
    }

    public void validateNumOfTests(int num) {
        if (num < 0 || num > 10) {
            throw new IllegalArgumentException(String.format(UNACCEPTABLE_TESTS_NUM, num));
        }
    }

    public void validateNumOfCities(int num) {
        if (num < 0 || num > 10_000) {
            throw new IllegalArgumentException(String.format(UNACCEPTABLE_CITIES_NUM, num));
        }
    }

    public void validateNumOfPaths(int num) {
        if (num < 0 || num > 100) {
            throw new IllegalArgumentException(String.format(UNACCEPTABLE_PATHS_NUM, num));
        }
    }
}
