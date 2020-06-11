package com.andremanuelbarbosa.projecteuler.problem7;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ProjectEulerProblem7Test {

    private ProjectEulerProblem7 projectEulerProblem7;

    @Before
    public void setUp() {

        projectEulerProblem7 = new ProjectEulerProblem7();
    }

    @Test
    public void shouldReturnSolution() {

        assertEquals(13, projectEulerProblem7.solution(6));

        System.out.println(projectEulerProblem7.solution(10001));
    }
}
