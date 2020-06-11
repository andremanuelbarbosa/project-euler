package com.andremanuelbarbosa.projecteuler.problem8;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ProjectEulerProblem8Test {

    private ProjectEulerProblem8 projectEulerProblem8;

    @Before
    public void setUp() {

        projectEulerProblem8 = new ProjectEulerProblem8();
    }

    @Test
    public void shouldReturnSolution() {

        assertEquals(5832, projectEulerProblem8.solution(4));

        System.out.println(projectEulerProblem8.solution(13));
    }
}
