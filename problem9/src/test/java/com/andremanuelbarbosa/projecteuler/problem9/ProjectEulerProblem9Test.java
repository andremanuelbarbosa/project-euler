package com.andremanuelbarbosa.projecteuler.problem9;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ProjectEulerProblem9Test {

    private ProjectEulerProblem9 projectEulerProblem9;

    @Before
    public void setUp() {

        projectEulerProblem9 = new ProjectEulerProblem9();
    }

    @Test
    public void shouldReturnSolution() {

        assertEquals(60, projectEulerProblem9.solution(12));

        System.out.println(projectEulerProblem9.solution(1000));
    }
}
