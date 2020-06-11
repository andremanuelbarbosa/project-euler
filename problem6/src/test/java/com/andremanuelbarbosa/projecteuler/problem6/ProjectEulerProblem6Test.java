package com.andremanuelbarbosa.projecteuler.problem6;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ProjectEulerProblem6Test {

    private ProjectEulerProblem6 projectEulerProblem6;

    @Before
    public void setUp() {

        projectEulerProblem6 = new ProjectEulerProblem6();
    }

    @Test
    public void shouldReturnSolution() {

        assertEquals(2640, projectEulerProblem6.solution(10));

        System.out.println(projectEulerProblem6.solution(100));
    }
}
