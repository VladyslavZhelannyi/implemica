package com.implemica.task2.graphpath;

import com.implemica.task2.model.PathPair;

public interface PathCostSearcher { //use interface not to depend on the certain realisation and in order to have
    //a possibility to write another realisation
    int findPathCost(int[][] citiesGraph, String[] cities, PathPair pathPair);
}
