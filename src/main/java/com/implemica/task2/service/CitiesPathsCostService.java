package com.implemica.task2.service;

import com.implemica.task2.graphpath.PathCostSearcher;
import com.implemica.task2.model.GraphTask;
import com.implemica.task2.model.PathPair;
import com.implemica.task2.util.Task2Converter;
import java.util.List;

public class CitiesPathsCostService {
    private final Task2Converter task2Converter;
    private final PathCostSearcher pathCostSearcher;

    public CitiesPathsCostService(Task2Converter task2Converter, PathCostSearcher pathCostSearcher) {
        this.task2Converter = task2Converter;
        this.pathCostSearcher = pathCostSearcher;
    }

    public String findCostsForPaths(String task) {
        if (task.isBlank()) {
            return "";
        }
        //delegate the conversion of separate tests into certain tasks to another method
        GraphTask[] graphTasks = task2Converter.convertToGraphTasks(task);
        String solution = solveGraphTasks(graphTasks);
        return solution;
    }

    private String solveGraphTasks(GraphTask[] graphTasks) {
        //solve task by task and append the solution to the result string
        StringBuilder allMinPathsCosts = new StringBuilder("");
        for (GraphTask graphTask : graphTasks) {
            int[][] citiesGraph = graphTask.getCitiesGraph();
            String[] cities = graphTask.getCities();
            List<PathPair> pathPairs = graphTask.getPathPairs();
            for (PathPair pathPair : pathPairs) {
                int pathMinCost = pathCostSearcher.findPathCost(citiesGraph, cities, pathPair);
                allMinPathsCosts.append(pathMinCost);
                allMinPathsCosts.append("\n");
            }
            allMinPathsCosts.append("\n");
        }
        return allMinPathsCosts.toString();
    }
}
