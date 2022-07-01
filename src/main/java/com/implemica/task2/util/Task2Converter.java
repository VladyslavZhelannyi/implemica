package com.implemica.task2.util;

import com.implemica.task2.model.GraphTask;
import com.implemica.task2.model.PathPair;
import java.util.Arrays;
import static com.implemica.constants.IllegalInputConstants.INVALID_DATA_FORMAT;

public class Task2Converter {
    private final Validation validation;

    public Task2Converter(Validation validation) {
        this.validation = validation;
    }

    public GraphTask[] convertToGraphTasks(String tasks) {
        //convert task that is represented as String into GraphTask array string by string
        GraphTask[] graphTasks;
        String[] taskStrings = tasks.split("\n");
        int position = 0;
        try {
            int testsNum = Integer.parseInt(taskStrings[position]);
            validation.validateNumOfTests(testsNum);
            graphTasks = new GraphTask[testsNum];
            if (testsNum != 0) {
                for (int i = 0; i < testsNum; i++) {
                    position++;
                    int citiesNum = Integer.parseInt(taskStrings[position]);
                    validation.validateNumOfCities(citiesNum);
                    //we build cities graph as a matrix where rows and columns match the number of cities
                    //value at the intersection is the cost of the path from the city which index is defined by the
                    //index of row to the city which index is defined by the index of column
                    int[][] citiesGraph = new int[citiesNum][citiesNum];
                    for (int j = 0; j < citiesGraph.length; j++) {
                        Arrays.fill(citiesGraph[j], -1);
                    }
                    String[] cities = new String[citiesNum];
                    for (int j = 0; j < citiesNum; j++) {
                        position++;
                        String cityName = taskStrings[position];
                        validation.validateCityName(cityName);
                        cities[j] = cityName;
                        position++;
                        int neighborsNum = Integer.parseInt(taskStrings[position]);
                        for (int k = 0; k < neighborsNum; k++) {
                            position++;
                            String[] pathCostStr = taskStrings[position].split(" ");
                            int sourceIndex = Integer.parseInt(pathCostStr[0]);
                            int cost = Integer.parseInt(pathCostStr[1]);
                            citiesGraph[j][sourceIndex - 1] = cost;
                        }
                    }
                    GraphTask graphTask = new GraphTask(citiesGraph, cities);
                    position++;
                    int pathToFindNum = Integer.parseInt(taskStrings[position]);
                    validation.validateNumOfPaths(pathToFindNum);
                    for (int j = 0; j < pathToFindNum; j++) {
                        position++;
                        String[] pathPairs = taskStrings[position].split(" ");
                        PathPair pathPair = new PathPair(pathPairs[0], pathPairs[1]);
                        graphTask.addPathPair(pathPair);
                    }
                    graphTasks[i] = graphTask;
                    position++;
                }
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(INVALID_DATA_FORMAT);
        }
        return graphTasks;
    }
}
