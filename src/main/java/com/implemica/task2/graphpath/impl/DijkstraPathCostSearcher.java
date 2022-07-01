package com.implemica.task2.graphpath.impl;

import com.implemica.task2.graphpath.PathCostSearcher;
import com.implemica.task2.model.PathPair;
import java.util.*;
import static com.implemica.constants.IllegalInputConstants.NO_CITY_IN_LIST;

public class DijkstraPathCostSearcher implements PathCostSearcher {
    @Override
    public int findPathCost(int[][] citiesGraph, String[] cities, PathPair pathPair) {
        //hashmap where key is a city index and value is the found cost of the path to this city from the source city
        Map<Integer, Integer> pathsCostMap = new HashMap<>();
        //set of visited cities that we do not to visit again or calculate cost to it cause if we have visited that city
        //it cannot have cheaper cost anyway
        Set<Integer> visitedCities = new HashSet<>();
        String sourceName = pathPair.getSource();
        String destinationName = pathPair.getDestination();
        if (sourceName.equals(destinationName)) {
            return 0;
        }
        //at once add to map source with 0 cost to start with and destination with the unreachable cost in order to
        //check the main condition
        int sourceIndex = findCityIndexByName(cities, sourceName);
        int destinationIndex = findCityIndexByName(cities, destinationName);
        pathsCostMap.put(sourceIndex, 0);
        pathsCostMap.put(destinationIndex, Integer.MAX_VALUE);
        int position;
        int minCostFromSource = pathsCostMap.values().stream().min(Integer::compareTo).get();
        //use Dijkstra algorithm where we count all costs from the city to not visited neighbors and then go to the city
        //in map that has the cheapest cost and repeat previous steps. process stops when there is no cheaper paths than
        //the path to the destination
        while (pathsCostMap.get(destinationIndex) > minCostFromSource) {
            int minCost = minCostFromSource;
            position = pathsCostMap.keySet().stream().filter(integer -> minCost == pathsCostMap.get(integer))
                    .findAny().get();
            int positionCost = pathsCostMap.get(position);
            for (int i = 0; i < citiesGraph[position].length; i++) {
                if (citiesGraph[position][i] != -1) {
                    if (!visitedCities.contains(i)) {
                        int costFromPosition = citiesGraph[position][i];
                        int costFromSource = positionCost + costFromPosition;
                        if (pathsCostMap.containsKey(i)) {
                            if (pathsCostMap.get(i) > costFromSource) {
                                pathsCostMap.put(i, costFromSource);
                            }
                        } else {
                            pathsCostMap.put(i, costFromSource);
                        }
                    }
                }
            }
            visitedCities.add(position);
            pathsCostMap.remove(position);
            minCostFromSource = pathsCostMap.values().stream().min(Integer::compareTo).get();
        }
        int destinationMinPath = pathsCostMap.get(destinationIndex);
        if (destinationMinPath == Integer.MAX_VALUE) {
            return -1;
        }
        return destinationMinPath;
    }

    private int findCityIndexByName(String[] cities, String name) {
        for (int i = 0; i < cities.length; i++) {
            String nextCity = cities[i];
            if (nextCity.equals(name)) {
                return i;
            }
        }
        throw new IllegalArgumentException(String.format(NO_CITY_IN_LIST, name));
    }
}
