package com.andremanuelbarbosa.projecteuler.problem3;

public class ProjectEulerProblem3 {

    private boolean isPrime(long number) {

        for (long i = ((long) Math.ceil(number / 2)); i > 1; i--) {

            if (number % i == 0) {

                return false;
            }
        }

        return true;
    }

    public long solution(long number) {

        for (long i = 2; i <= number; i++) {

            final long factor = number / i;

            if (number % i == 0 && isPrime(factor)) {

                return factor;
            }
        }

        return 1;
    }
}
