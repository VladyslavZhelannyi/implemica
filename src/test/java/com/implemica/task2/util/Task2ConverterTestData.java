package com.implemica.task2.util;

import com.implemica.task2.model.GraphTask;
import com.implemica.task2.model.PathPair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2ConverterTestData {
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
            "bydgoszcz warszawa\n" +
            "\n" +
            "8\n" +
            "a\n" +
            "2\n" +
            "2 3\n" +
            "8 5\n" +
            "b\n" +
            "3\n" +
            "1 3\n" +
            "4 4\n" +
            "8 2\n" +
            "c\n" +
            "2\n" +
            "5 8\n" +
            "6 7\n" +
            "d\n" +
            "3\n" +
            "2 4\n" +
            "7 3\n" +
            "8 1\n" +
            "e\n" +
            "1\n" +
            "3 8\n" +
            "f\n" +
            "2\n" +
            "3 7\n" +
            "7 4\n" +
            "g\n" +
            "3\n" +
            "4 3\n" +
            "6 4\n" +
            "8 1\n" +
            "h\n" +
            "4\n" +
            "1 5\n" +
            "2 2\n" +
            "4 1\n" +
            "7 1\n" +
            "2\n" +
            "f d\n" +
            "a e\n";
    public static final String TASKS_2 = "1\n" +
            "8\n" +
            "j\n" +
            "2\n" +
            "2 3\n" +
            "8 5\n" +
            "k\n" +
            "3\n" +
            "1 3\n" +
            "4 4\n" +
            "8 2\n" +
            "l\n" +
            "2\n" +
            "5 12\n" +
            "6 11\n" +
            "m\n" +
            "3\n" +
            "2 4\n" +
            "7 3\n" +
            "8 1\n" +
            "n\n" +
            "1\n" +
            "3 12\n" +
            "o\n" +
            "2\n" +
            "3 11\n" +
            "7 4\n" +
            "p\n" +
            "3\n" +
            "4 3\n" +
            "6 4\n" +
            "8 1\n" +
            "r\n" +
            "4\n" +
            "1 5\n" +
            "2 2\n" +
            "4 1\n" +
            "7 1\n" +
            "2\n" +
            "p r\n" +
            "j l\n";
    public static final String GRAPH_1_CITY_1 = "gdansk";
    public static final String GRAPH_1_CITY_2 = "bydgoszcz";
    public static final String GRAPH_1_CITY_3 = "torun";
    public static final String GRAPH_1_CITY_4 = "warszawa";
    public static final String GRAPH_2_CITY_1 = "a";
    public static final String GRAPH_2_CITY_2 = "b";
    public static final String GRAPH_2_CITY_3 = "c";
    public static final String GRAPH_2_CITY_4 = "d";
    public static final String GRAPH_2_CITY_5 = "e";
    public static final String GRAPH_2_CITY_6 = "f";
    public static final String GRAPH_2_CITY_7 = "g";
    public static final String GRAPH_2_CITY_8 = "h";
    public static final String GRAPH_3_CITY_1 = "j";
    public static final String GRAPH_3_CITY_2 = "k";
    public static final String GRAPH_3_CITY_3 = "l";
    public static final String GRAPH_3_CITY_4 = "m";
    public static final String GRAPH_3_CITY_5 = "n";
    public static final String GRAPH_3_CITY_6 = "o";
    public static final String GRAPH_3_CITY_7 = "p";
    public static final String GRAPH_3_CITY_8 = "r";
    public static final int VALIDATE_CITY_NAME_TIMES = 1;
    public static final int VALIDATE_TESTS_NUM_TIMES = 1;
    public static final int VALIDATE_CITIES_NUM_TIMES = 1;
    public static final int VALIDATE_PATHS_NUM_TIMES_1 = 2;
    public static final int VALIDATE_PATHS_NUM_TIMES_2 = 1;
    public static final int CITIES_NUM_1 = 4;
    public static final int CITIES_NUM_2 = 8;
    public static final int CITIES_NUM_3 = 8;
    public static final int TESTS_NUM_1 = 2;
    public static final int TESTS_NUM_2 = 1;
    public static final int PATHS_NUM = 2;
    public static final int[][] CITIES_GRAPH_1 = {{-1, 1, 3, -1},{1, -1, 1, 4},{3, 1, -1, 1},{-1, 4, 1, -1}};
    public static final int[][] CITIES_GRAPH_2 = {{-1, 3, -1, -1, -1, -1, -1, 5}, {3, -1, -1, 4, -1, -1, -1, 2},
            {-1, -1, -1, -1, 8, 7, -1, -1}, {-1, 4, -1, -1, -1, -1, 3, 1}, {-1, -1, 8, -1, -1, -1, -1, -1},
            {-1, -1, 7, -1, -1, -1, 4, -1}, {-1, -1, -1, 3, -1, 4, -1, 1}, {5, 2, -1, 1, -1, -1, 1, -1}};
    public static final int[][] CITIES_GRAPH_3 = {{-1, 3, -1, -1, -1, -1, -1, 5}, {3, -1, -1, 4, -1, -1, -1, 2},
            {-1, -1, -1, -1, 12, 11, -1, -1}, {-1, 4, -1, -1, -1, -1, 3, 1}, {-1, -1, 12, -1, -1, -1, -1, -1},
            {-1, -1, 11, -1, -1, -1, 4, -1}, {-1, -1, -1, 3, -1, 4, -1, 1}, {5, 2, -1, 1, -1, -1, 1, -1}};
    public static final String[] CITIES_1 = {GRAPH_1_CITY_1, GRAPH_1_CITY_2, GRAPH_1_CITY_3, GRAPH_1_CITY_4};
    public static final String[] CITIES_2 = {GRAPH_2_CITY_1, GRAPH_2_CITY_2, GRAPH_2_CITY_3, GRAPH_2_CITY_4,
            GRAPH_2_CITY_5, GRAPH_2_CITY_6, GRAPH_2_CITY_7, GRAPH_2_CITY_8};
    public static final String[] CITIES_3 = {GRAPH_3_CITY_1, GRAPH_3_CITY_2, GRAPH_3_CITY_3, GRAPH_3_CITY_4,
            GRAPH_3_CITY_5, GRAPH_3_CITY_6, GRAPH_3_CITY_7, GRAPH_3_CITY_8};
    private static final PathPair PATH_PAIR_1_1 = new PathPair(GRAPH_1_CITY_1, GRAPH_1_CITY_4);
    private static final PathPair PATH_PAIR_1_2 = new PathPair(GRAPH_1_CITY_2, GRAPH_1_CITY_4);
    private static final PathPair PATH_PAIR_2_1 = new PathPair(GRAPH_2_CITY_6, GRAPH_2_CITY_4);
    private static final PathPair PATH_PAIR_2_2 = new PathPair(GRAPH_2_CITY_1, GRAPH_2_CITY_5);
    private static final PathPair PATH_PAIR_3_1 = new PathPair(GRAPH_3_CITY_7, GRAPH_3_CITY_8);
    private static final PathPair PATH_PAIR_3_2 = new PathPair(GRAPH_3_CITY_1, GRAPH_3_CITY_3);
    public static final List<PathPair> PATH_PAIRS_1 = new ArrayList<>(Arrays.asList(PATH_PAIR_1_1, PATH_PAIR_1_2));
    public static final List<PathPair> PATH_PAIRS_2 = new ArrayList<>(Arrays.asList(PATH_PAIR_2_1, PATH_PAIR_2_2));
    public static final List<PathPair> PATH_PAIRS_3 = new ArrayList<>(Arrays.asList(PATH_PAIR_3_1, PATH_PAIR_3_2));
    public static final GraphTask GRAPH_TASK_1 = new GraphTask(CITIES_GRAPH_1, CITIES_1, PATH_PAIRS_1);
    public static final GraphTask GRAPH_TASK_2 = new GraphTask(CITIES_GRAPH_2, CITIES_2, PATH_PAIRS_2);
    public static final GraphTask GRAPH_TASK_3 = new GraphTask(CITIES_GRAPH_3, CITIES_3, PATH_PAIRS_3);
    public static final GraphTask[] EXPECTED_1 = {GRAPH_TASK_1, GRAPH_TASK_2};
    public static final GraphTask[] EXPECTED_2 = {GRAPH_TASK_3};
}
