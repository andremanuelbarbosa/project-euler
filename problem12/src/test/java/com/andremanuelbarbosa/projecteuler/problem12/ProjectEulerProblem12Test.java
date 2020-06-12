package com.andremanuelbarbosa.projecteuler.problem12;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ProjectEulerProblem12Test {

    private ProjectEulerProblem12 projectEulerProblem12;

    @Before
    public void setUp() {

        projectEulerProblem12 = new ProjectEulerProblem12();
    }

    @Test
    public void shouldReturnSolution() {

        assertEquals(28, projectEulerProblem12.solution(5));

        System.out.println(projectEulerProblem12.solution(500));
    }
}
