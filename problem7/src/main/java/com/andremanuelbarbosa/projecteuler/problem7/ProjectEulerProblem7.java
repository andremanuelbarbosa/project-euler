package com.andremanuelbarbosa.projecteuler.problem7;

public class ProjectEulerProblem7 {

    private boolean isPrime(long number) {

        for (long i = ((long) Math.ceil((double) number / 2)); i > 1; i--) {

            if (number % i == 0) {

                return false;
            }
        }

        return true;
    }

    public long solution(int nthPrime) {

        int primesCount = 0;

        for (long i = 2; ; i++) {

            if (isPrime(i)) {

                primesCount++;

                if (primesCount == nthPrime) {

                    return i;
                }
            }
        }
    }
}
