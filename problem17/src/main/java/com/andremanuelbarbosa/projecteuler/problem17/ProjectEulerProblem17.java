package com.andremanuelbarbosa.projecteuler.problem17;

public class ProjectEulerProblem17 {

    private static final String[] NAMES = {
            "",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen"
    };

    private static final String[] TENS_NAMES = {
            "",
            "",
            "twenty",
            "thirty",
            "forty",
            "fifty",
            "sixty",
            "seventy",
            "eighty",
            "ninety"
    };

    public long solution(int min, int max) {

        String words = "";

        for (int i = min; i <= max; i++) {

            if (words.length() > 0) {

                words += " ";
            }

            if (i < NAMES.length) {

                words += NAMES[i];

            } else if (i < 100) {

                words += TENS_NAMES[i / 10];

                final String name = NAMES[i % 10];
                if (name.length() > 0) {
                    words += " " + name;
                }

            } else if (i < 1000) {

                words += NAMES[i / 100] + " hundred";

                if(i % 100 != 0) {

                    words += " and ";
                }

                if (i > 100) {

                    int remainder = i % 100;

                    if (remainder >= 20) {
                        words += TENS_NAMES[remainder / 10];

                        final String name = NAMES[remainder % 10];
                        if (name.length() > 0) {
                            words += " " + name;
                        }
                    } else {
                        words += NAMES[remainder];
                    }
                }

            } else if (i == 1000) {

                words += "one thousand";

            } else {

                throw new IllegalArgumentException();
            }
        }

        final String[] wordsTokens = words.split(" ");

        int sum = 0;

        for (int i = 0; i < wordsTokens.length; i++) {

            sum += wordsTokens[i].length();
        }

        return sum;
    }
}
