package com.andremanuelbarbosa.projecteuler.problem6;

public class ProjectEulerProblem6 {

    private long getSumOfSquares(int numbersCount) {

        long sumOfSquares = 0;

        for(int i = 1; i <= numbersCount; i++) {

            sumOfSquares += (i * i);
        }

        return sumOfSquares;
    }

    private long getSquareOfSum(int numbersCount) {

        long sum = 0;

        for(int i = 1; i <= numbersCount; i++) {

            sum += i;
        }

        return sum * sum;
    }

    public long solution(int numbersCount) {

        return getSquareOfSum(numbersCount) - getSumOfSquares(numbersCount);
    }
}
