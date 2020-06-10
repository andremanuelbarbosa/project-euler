package com.andremanuelbarbosa.projecteuler.problem3;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ProjectEulerProblem2Test {

    private ProjectEulerProblem2 projectEulerProblem2;

    @Before
    public void setUp() {

        projectEulerProblem2 = new ProjectEulerProblem2();
    }

    @Test
    public void shouldReturnSolution() {

        System.out.println(projectEulerProblem2.solution());
    }
}
