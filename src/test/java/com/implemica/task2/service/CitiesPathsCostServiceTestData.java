package com.implemica.task2.service;

import com.implemica.task2.model.GraphTask;
import com.implemica.task2.model.PathPair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CitiesPathsCostServiceTestData {
    public static final String TASKS_1 = "2\n" +
            "4\n" +
            "gdansk\n" +
            "2\n" +
            "2 1\n" +
            "3 3\n" +
            "bydgoszcz\n" +
            "3\n" +
            "1 1\n" +
            "3 1\n" +
            "4 4\n" +
            "torun\n" +
            "3\n" +
            "1 3\n" +
            "2 1\n" +
            "4 1\n" +
            "warszawa\n" +
            "2\n" +
            "2 4\n" +
            "3 1\n" +
            "2\n" +
            "gdansk warszawa\n" +
            "bydgoszcz warszawa\n";
    public static final String TASKS_2 = "";
    public static final String GRAPH_1_CITY_1 = "gdansk";
    public static final String GRAPH_1_CITY_2 = "bydgoszcz";
    public static final String GRAPH_1_CITY_3 = "torun";
    public static final String GRAPH_1_CITY_4 = "warszawa";
    public static final int[][] CITIES_GRAPH_1 = {{-1, 1, 3, -1},{1, -1, 1, 4},{3, 1, -1, 1},{-1, 4, 1, -1}};
    public static final int[][] CITIES_GRAPH_2 = null;
    public static final String[] CITIES_1 = {GRAPH_1_CITY_1, GRAPH_1_CITY_2, GRAPH_1_CITY_3, GRAPH_1_CITY_4};
    public static final String[] CITIES_2 = null;
    public static final PathPair PATH_PAIR_1_1 = new PathPair(GRAPH_1_CITY_1, GRAPH_1_CITY_4);
    public static final PathPair PATH_PAIR_1_2 = new PathPair(GRAPH_1_CITY_2, GRAPH_1_CITY_4);
    public static final PathPair PATH_PAIR_2 = null;
    public static final List<PathPair> PATH_PAIRS_1 = new ArrayList<>(Arrays.asList(PATH_PAIR_1_1, PATH_PAIR_1_2));
    public static final GraphTask GRAPH_TASK_1 = new GraphTask(CITIES_GRAPH_1, CITIES_1, PATH_PAIRS_1);
    public static final GraphTask[] GRAPH_TASKS_1 = {GRAPH_TASK_1};
    public static final GraphTask[] GRAPH_TASKS_2 = null;
    public static final int PATH_COST_1 = 3;
    public static final int PATH_COST_2 = 2;
    public static final int PATH_COST_3 = 0;
    public static final String EXPECTED_1 = "3\n2\n\n";
    public static final String EXPECTED_2 = "";
}
