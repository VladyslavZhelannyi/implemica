package com.implemica.task2.graphpath.impl;

import com.implemica.task2.model.PathPair;

public class DijkstraPathCostSearcherTestData {
    private static final String GRAPH_1_CITY_1 = "gdansk";
    private static final String GRAPH_1_CITY_2 = "bydgoszcz";
    private static final String GRAPH_1_CITY_3 = "torun";
    private static final String GRAPH_1_CITY_4 = "warszawa";
    private static final String GRAPH_2_CITY_1 = "a";
    private static final String GRAPH_2_CITY_2 = "b";
    private static final String GRAPH_2_CITY_3 = "c";
    private static final String GRAPH_2_CITY_4 = "d";
    private static final String GRAPH_2_CITY_5 = "e";
    private static final String GRAPH_2_CITY_6 = "f";
    private static final String GRAPH_2_CITY_7 = "g";
    private static final String GRAPH_2_CITY_8 = "h";
    public static final int[][] CITIES_GRAPH_1 = {{-1,1,3,-1},{1,-1,1,4},{3,1,-1,1},{-1,4,1,-1}};
    public static final int[][] CITIES_GRAPH_2 = {{-1, 3, -1, -1, -1, -1, -1, 5}, {3, -1, -1, 4, -1, -1, -1, 2},
            {-1, -1, -1, -1, 8, 7, -1, -1}, {-1, 4, -1, -1, -1, -1, 3, 1}, {-1, -1, 8, -1, -1, -1, -1, -1},
            {-1, -1, 7, -1, -1, -1, 4, -1}, {-1, -1, -1, 3, -1, 4, -1, 1}, {5, 2, -1, 1, -1, -1, 1, -1}};
    public static final String[] CITIES_1 = {GRAPH_1_CITY_1, GRAPH_1_CITY_2, GRAPH_1_CITY_3, GRAPH_1_CITY_4};
    public static final String[] CITIES_2 = {GRAPH_2_CITY_1, GRAPH_2_CITY_2, GRAPH_2_CITY_3, GRAPH_2_CITY_4,
            GRAPH_2_CITY_5, GRAPH_2_CITY_6, GRAPH_2_CITY_7, GRAPH_2_CITY_8};
    public static final PathPair PATH_PAIR_1 = new PathPair(GRAPH_1_CITY_1, GRAPH_1_CITY_4);
    public static final PathPair PATH_PAIR_2 = new PathPair(GRAPH_2_CITY_1, GRAPH_2_CITY_5);
    public static final int EXPECTED_1 = 3;
    public static final int EXPECTED_2 = 25;
}
