package com.andremanuelbarbosa.projecteuler.problem11;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ProjectEulerProblem11Test {

    private ProjectEulerProblem11 projectEulerProblem11;

    @Before
    public void setUp() {

        projectEulerProblem11 = new ProjectEulerProblem11();
    }

    @Test
    public void shouldReturnSolution() {

        System.out.println(projectEulerProblem11.solution(4));
    }
}
