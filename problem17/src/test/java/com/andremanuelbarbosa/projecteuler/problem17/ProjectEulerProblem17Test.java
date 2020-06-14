package com.andremanuelbarbosa.projecteuler.problem17;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ProjectEulerProblem17Test {

    private ProjectEulerProblem17 projectEulerProblem17;

    @Before
    public void setUp() {

        projectEulerProblem17 = new ProjectEulerProblem17();
    }

    @Test
    public void shouldReturnSolution() {

        assertEquals(19, projectEulerProblem17.solution(1, 5));

        System.out.println(projectEulerProblem17.solution(1, 1000));
    }
}
