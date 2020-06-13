package com.andremanuelbarbosa.projecteuler.problem16;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ProjectEulerProblem16Test {

    private ProjectEulerProblem16 projectEulerProblem16;

    @Before
    public void setUp() {

        projectEulerProblem16 = new ProjectEulerProblem16();
    }

    @Test
    public void shouldReturnSolution() {

        assertEquals(26, projectEulerProblem16.solution(2, 15));

        System.out.println(projectEulerProblem16.solution(2, 1000));
    }
}
