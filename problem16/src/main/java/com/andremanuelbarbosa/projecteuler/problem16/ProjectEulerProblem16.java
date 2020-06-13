package com.andremanuelbarbosa.projecteuler.problem16;

import java.math.BigInteger;

public class ProjectEulerProblem16 {

    public long solution(int base, int exponent) {

        final String pow = new BigInteger("" + base).pow(exponent).toString();

        long sum = 0;

        for (int i = 0; i < pow.length(); i++) {

            sum += Character.getNumericValue(pow.charAt(i));
        }

        return sum;
    }
}
