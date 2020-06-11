package com.andremanuelbarbosa.projecteuler.problem4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ProjectEulerProblem4Test {

    private ProjectEulerProblem4 projectEulerProblem4;

    @Before
    public void setUp() {

        projectEulerProblem4 = new ProjectEulerProblem4();
    }

    @Test
    public void shouldReturnSolution() {

        assertEquals(9009, projectEulerProblem4.solution(2));

        System.out.println(projectEulerProblem4.solution(3));
    }
}
