package com.andremanuelbarbosa.projecteuler.problem12;

public class ProjectEulerProblem12 {

    private long getTriangleNumber(int nth) {

        long triangleNumber = 0;

        for(int i = 1; i <= nth; i++) {

            triangleNumber += i;
        }

        return triangleNumber;
    }

    private int getDivisorsCount(long number) {

        int divisorsCount = 1;

        for(long i = 1; i <= (long) Math.ceil(number / 2); i++) {

            if(number % i == 0) {

                divisorsCount++;
            }
        }

        return divisorsCount;
    }

    public long solution(int minDivisorsCount) {

        int i = 1;
        long triangleNumber;

        do {
            triangleNumber = getTriangleNumber(i++);
        } while(getDivisorsCount(triangleNumber) <= minDivisorsCount);

        return triangleNumber;
    }
}
