package com.andremanuelbarbosa.projecteuler.problem4;

public class ProjectEulerProblem4 {

    private boolean isPalindromic(long number) {

        String string1 = "" + number;
        String string2 = "";

        for (int i = string1.length(); i > 0; i--) {

            string2 += string1.toCharArray()[i - 1];
        }

        return string1.equals(string2);
    }

    public long solution(int digitsCount) {

        final long max = (long) Math.pow(10, digitsCount) - 1;

        long largestPalindrome = 0;

        for (long i = max; i > 0; i--) {

            for(long j = max; j >= 0; j--) {

                final long number = i * j;

                if (number > largestPalindrome && isPalindromic(number)) {

                    largestPalindrome = number;
                }
            }
        }

        return largestPalindrome;
    }
}
