package com.andremanuelbarbosa.projecteuler.problem15;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ProjectEulerProblem15Test {

    private ProjectEulerProblem15 projectEulerProblem15;

    @Before
    public void setUp() {

        projectEulerProblem15 = new ProjectEulerProblem15();
    }

    @Test
    public void shouldReturnSolution() {

        assertEquals(6, projectEulerProblem15.solution(2));

        System.out.println(projectEulerProblem15.solution(20));
    }
}
