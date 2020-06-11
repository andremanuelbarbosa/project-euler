package com.andremanuelbarbosa.projecteuler.problem5;

public class ProjectEulerProblem5 {

    private boolean isDivisible(int number, int maxDivider) {

        for (int i = 1; i <= maxDivider; i++) {

            if (number % i != 0) {

                return false;
            }
        }

        return true;
    }

    public long solution(int maxDivider) {

        int number = 0;

        while (!isDivisible(++number, maxDivider)) ;

        return number;
    }
}
