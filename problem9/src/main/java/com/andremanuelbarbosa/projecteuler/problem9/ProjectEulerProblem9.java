package com.andremanuelbarbosa.projecteuler.problem9;

public class ProjectEulerProblem9 {

    private boolean isPythagoreanTriplet(long a, long b, long c) {

        return (Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2);
    }

    public long solution(int tripletSum) {

        final long sqrt = (long) Math.ceil(tripletSum / 2);

        for (int i = 1; i < sqrt; i++) {

            for (long j = 1; j < sqrt; j++) {

                for (long k = 1; k < sqrt; k++) {

                    if ((i + j + k) == tripletSum && isPythagoreanTriplet(i, j, k)) {

                        return i * j * k;
                    }
                }
            }
        }

        return -1;
    }
}
