package com.andremanuelbarbosa.projecteuler.problem10;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ProjectEulerProblem10Test {

    private ProjectEulerProblem10 projectEulerProblem10;

    @Before
    public void setUp() {

        projectEulerProblem10 = new ProjectEulerProblem10();
    }

    @Test
    public void shouldReturnSolution() {

        assertEquals(17, projectEulerProblem10.solution(10));

        System.out.println(projectEulerProblem10.solution(2000000));
    }
}
