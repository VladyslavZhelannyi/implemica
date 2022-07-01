package com.implemica.task2.model;

import lombok.Getter;
import lombok.ToString;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Getter
@ToString
public class GraphTask { //class for representation of the task as an object
    private final int[][] citiesGraph;
    private final String[] cities;
    private List<PathPair> pathPairs;

    public GraphTask(int[][] citiesGraph, String[] cities) {
        this.citiesGraph = citiesGraph;
        this.cities = cities;
        pathPairs = new ArrayList<>();
    }

    public GraphTask(int[][] citiesGraph, String[] cities, List<PathPair> pathPairs) {
        this.citiesGraph = citiesGraph;
        this.cities = cities;
        this.pathPairs = pathPairs;
    }

    public void addPathPair(PathPair pathPair) {
        pathPairs.add(pathPair);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GraphTask graphTask = (GraphTask) o;
        return Arrays.deepEquals(citiesGraph, graphTask.citiesGraph) && Arrays.equals(cities, graphTask.cities) && Objects.equals(pathPairs, graphTask.pathPairs);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(pathPairs);
        result = 31 * result + Arrays.deepHashCode(citiesGraph);
        result = 31 * result + Arrays.hashCode(cities);
        return result;
    }
}
