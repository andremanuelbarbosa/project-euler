package com.andremanuelbarbosa.projecteuler.problem3;

public class ProjectEulerProblem2 {

    public int solution() {

        int sum = 0;
        int fibonacciCurrent = 2;
        int fibonacciPrevious = 1;

        while(fibonacciCurrent <= 4000000) {
            int fibonacciNext = fibonacciCurrent + fibonacciPrevious;
            fibonacciPrevious = fibonacciCurrent;
            if(fibonacciCurrent % 2 == 0) {
                sum += fibonacciCurrent;
            }
            fibonacciCurrent = fibonacciNext;
        }

        return sum;
    }
}
