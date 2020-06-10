package com.andremanuelbarbosa.projecteuler.problem3;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ProjectEulerProblem3Test {

    private ProjectEulerProblem3 projectEulerProblem3;

    @Before
    public void setUp() {

        projectEulerProblem3 = new ProjectEulerProblem3();
    }

    @Test
    public void shouldReturnSolution() {

        System.out.println(projectEulerProblem3.solution(600851475143l));
    }
}
