package com.andremanuelbarbosa.projecteuler.problem15;

public class ProjectEulerProblem15 {

    private long routes = 0;

    private long getRoutesCount(int x, int y, int gridSize) {

        if (x < gridSize) {
            getRoutesCount(x + 1, y, gridSize);
        }

        if (y < gridSize) {
            getRoutesCount(x, y + 1, gridSize);
        }

        if(x == gridSize && y == gridSize) {
            routes++;
        }

        return routes;
    }

    public long solution(int gridSize) {

        routes = 0;

        return getRoutesCount(0, 0, gridSize);
    }
}
