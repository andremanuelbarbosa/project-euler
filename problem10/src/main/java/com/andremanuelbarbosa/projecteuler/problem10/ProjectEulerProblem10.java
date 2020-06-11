package com.andremanuelbarbosa.projecteuler.problem10;

public class ProjectEulerProblem10 {

    private boolean isPrime(long number) {

        for (long i = 2; i <= ((long) Math.ceil((double) number / 2)); i++) {

            if (number % i == 0) {

                return false;
            }
        }

        return true;
    }

    public long solution(long max) {

        long sum = 0;

        for(long i = 2; i < max; i++) {

            if(isPrime(i)) {

                sum += i;
            }
        }

        return sum;
    }
}
