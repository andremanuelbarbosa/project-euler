package com.andremanuelbarbosa.projecteuler.problem1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ProjectEulerProblem1Test {

    private ProjectEulerProblem1 projectEulerProblem1;

    @Before
    public void setUp() {

        projectEulerProblem1 = new ProjectEulerProblem1();
    }

    @Test
    public void shouldReturnSolutions() {

        System.out.println(projectEulerProblem1.solution());
    }
}
