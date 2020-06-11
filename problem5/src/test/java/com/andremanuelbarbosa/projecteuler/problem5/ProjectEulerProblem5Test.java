package com.andremanuelbarbosa.projecteuler.problem5;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ProjectEulerProblem5Test {

    private ProjectEulerProblem5 projectEulerProblem5;

    @Before
    public void setUp() {

        projectEulerProblem5 = new ProjectEulerProblem5();
    }

    @Test
    public void shouldReturnSolution() {

        assertEquals(2520, projectEulerProblem5.solution(10));

        System.out.println(projectEulerProblem5.solution(20));
    }
}
