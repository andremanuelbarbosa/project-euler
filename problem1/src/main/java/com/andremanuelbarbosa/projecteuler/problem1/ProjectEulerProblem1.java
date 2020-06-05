package com.andremanuelbarbosa.projecteuler.problem1;

public class ProjectEulerProblem1 {

    public int solution() {

        int sum = 0;

        for(int i = 3; i < 1000; i++) {

            if(i % 3 == 0 || i % 5 == 0) {

                sum += i;
            }
        }

        return sum;
    }
}
