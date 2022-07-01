package com.implemica.task2.util;

import com.implemica.task2.model.GraphTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static com.implemica.task2.util.Task2ConverterTestData.*;

public class Task2ConverterTest {
    private final Validation validation = Mockito.mock(Validation.class);
    private final Task2Converter cut = new Task2Converter(validation);

    @Test
    public void convertToGraphTasksTest1() {
        GraphTask[] actual = cut.convertToGraphTasks(TASKS_1);

        Mockito.verify(validation, Mockito.times(VALIDATE_CITY_NAME_TIMES)).validateCityName(GRAPH_1_CITY_1);
        Mockito.verify(validation, Mockito.times(VALIDATE_CITY_NAME_TIMES)).validateCityName(GRAPH_1_CITY_2);
        Mockito.verify(validation, Mockito.times(VALIDATE_CITY_NAME_TIMES)).validateCityName(GRAPH_1_CITY_3);
        Mockito.verify(validation, Mockito.times(VALIDATE_CITY_NAME_TIMES)).validateCityName(GRAPH_1_CITY_4);
        Mockito.verify(validation, Mockito.times(VALIDATE_CITY_NAME_TIMES)).validateCityName(GRAPH_2_CITY_1);
        Mockito.verify(validation, Mockito.times(VALIDATE_CITY_NAME_TIMES)).validateCityName(GRAPH_2_CITY_2);
        Mockito.verify(validation, Mockito.times(VALIDATE_CITY_NAME_TIMES)).validateCityName(GRAPH_2_CITY_3);
        Mockito.verify(validation, Mockito.times(VALIDATE_CITY_NAME_TIMES)).validateCityName(GRAPH_2_CITY_4);
        Mockito.verify(validation, Mockito.times(VALIDATE_CITY_NAME_TIMES)).validateCityName(GRAPH_2_CITY_5);
        Mockito.verify(validation, Mockito.times(VALIDATE_CITY_NAME_TIMES)).validateCityName(GRAPH_2_CITY_6);
        Mockito.verify(validation, Mockito.times(VALIDATE_CITY_NAME_TIMES)).validateCityName(GRAPH_2_CITY_7);
        Mockito.verify(validation, Mockito.times(VALIDATE_CITY_NAME_TIMES)).validateCityName(GRAPH_2_CITY_8);
        Mockito.verify(validation, Mockito.times(VALIDATE_TESTS_NUM_TIMES)).validateNumOfTests(TESTS_NUM_1);
        Mockito.verify(validation, Mockito.times(VALIDATE_CITIES_NUM_TIMES)).validateNumOfCities(CITIES_NUM_1);
        Mockito.verify(validation, Mockito.times(VALIDATE_CITIES_NUM_TIMES)).validateNumOfCities(CITIES_NUM_2);
        Mockito.verify(validation, Mockito.times(VALIDATE_PATHS_NUM_TIMES_1)).validateNumOfPaths(PATHS_NUM);

        Assertions.assertArrayEquals(EXPECTED_1, actual);
    }

    @Test
    public void convertToGraphTasksTest2() {
        GraphTask[] actual = cut.convertToGraphTasks(TASKS_2);

        Mockito.verify(validation, Mockito.times(VALIDATE_CITY_NAME_TIMES)).validateCityName(GRAPH_3_CITY_1);
        Mockito.verify(validation, Mockito.times(VALIDATE_CITY_NAME_TIMES)).validateCityName(GRAPH_3_CITY_2);
        Mockito.verify(validation, Mockito.times(VALIDATE_CITY_NAME_TIMES)).validateCityName(GRAPH_3_CITY_3);
        Mockito.verify(validation, Mockito.times(VALIDATE_CITY_NAME_TIMES)).validateCityName(GRAPH_3_CITY_4);
        Mockito.verify(validation, Mockito.times(VALIDATE_CITY_NAME_TIMES)).validateCityName(GRAPH_3_CITY_5);
        Mockito.verify(validation, Mockito.times(VALIDATE_CITY_NAME_TIMES)).validateCityName(GRAPH_3_CITY_6);
        Mockito.verify(validation, Mockito.times(VALIDATE_CITY_NAME_TIMES)).validateCityName(GRAPH_3_CITY_7);
        Mockito.verify(validation, Mockito.times(VALIDATE_CITY_NAME_TIMES)).validateCityName(GRAPH_3_CITY_8);
        Mockito.verify(validation, Mockito.times(VALIDATE_TESTS_NUM_TIMES)).validateNumOfTests(TESTS_NUM_2);
        Mockito.verify(validation, Mockito.times(VALIDATE_CITIES_NUM_TIMES)).validateNumOfCities(CITIES_NUM_3);
        Mockito.verify(validation, Mockito.times(VALIDATE_PATHS_NUM_TIMES_2)).validateNumOfPaths(PATHS_NUM);

        Assertions.assertArrayEquals(EXPECTED_2, actual);
    }
}
