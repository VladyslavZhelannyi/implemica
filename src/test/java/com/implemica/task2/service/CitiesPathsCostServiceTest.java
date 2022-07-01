package com.implemica.task2.service;

import com.implemica.task2.graphpath.PathCostSearcher;
import com.implemica.task2.model.GraphTask;
import com.implemica.task2.model.PathPair;
import com.implemica.task2.util.Task2Converter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;
import static com.implemica.task2.service.CitiesPathsCostServiceTestData.*;

public class CitiesPathsCostServiceTest {
    private final Task2Converter task2Converter = Mockito.mock(Task2Converter.class);
    private final PathCostSearcher pathCostSearcher = Mockito.mock(PathCostSearcher.class);
    private final CitiesPathsCostService cut = new CitiesPathsCostService(task2Converter, pathCostSearcher);

    public static Arguments[] findCostsForPathsTestArgs() {
        return new Arguments[] {
                Arguments.arguments(TASKS_1, GRAPH_TASKS_1, CITIES_GRAPH_1, CITIES_1, PATH_PAIR_1_1, PATH_PAIR_1_2,
                        PATH_COST_1, PATH_COST_2, EXPECTED_1),
                Arguments.arguments(TASKS_2, GRAPH_TASKS_2, CITIES_GRAPH_2, CITIES_2, PATH_PAIR_2, PATH_PAIR_2,
                        PATH_COST_3, PATH_COST_3, EXPECTED_2)
        };
    }

    @ParameterizedTest
    @MethodSource("findCostsForPathsTestArgs")
    public void findCostsForPathsTest(String task, GraphTask[] graphTasks, int[][] citiesGraph1, String[] cities1,
                                      PathPair pathPair1, PathPair pathPair2, int pathCost1, int pathCost2,
                                      String expected) {
        Mockito.when(task2Converter.convertToGraphTasks(task)).thenReturn(graphTasks);
        Mockito.when(pathCostSearcher.findPathCost(citiesGraph1, cities1, pathPair1)).thenReturn(pathCost1);
        Mockito.when(pathCostSearcher.findPathCost(citiesGraph1, cities1, pathPair2)).thenReturn(pathCost2);

        String actual = cut.findCostsForPaths(task);

        Assertions.assertEquals(expected, actual);
    }
}
