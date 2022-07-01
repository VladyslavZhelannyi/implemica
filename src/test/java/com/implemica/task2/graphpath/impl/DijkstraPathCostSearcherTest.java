package com.implemica.task2.graphpath.impl;

import com.implemica.task2.model.PathPair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static com.implemica.task2.graphpath.impl.DijkstraPathCostSearcherTestData.*;

public class DijkstraPathCostSearcherTest {
    DijkstraPathCostSearcher cut = new DijkstraPathCostSearcher();

    public static Arguments[] findPathCostTestArgs() {
        return new Arguments[] {
                Arguments.arguments(CITIES_GRAPH_1, CITIES_1, PATH_PAIR_1, EXPECTED_1),
                Arguments.arguments(CITIES_GRAPH_2, CITIES_2, PATH_PAIR_2, EXPECTED_2)
        };
    }

    @ParameterizedTest
    @MethodSource("findPathCostTestArgs")
    public void findPathCostTest(int[][] citiesGraph, String[] cities, PathPair pathPair, int expected) {
        int actual = cut.findPathCost(citiesGraph, cities, pathPair);
        Assertions.assertEquals(expected, actual);
    }
}
