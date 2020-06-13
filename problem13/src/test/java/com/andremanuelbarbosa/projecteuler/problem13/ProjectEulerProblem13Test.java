package com.andremanuelbarbosa.projecteuler.problem13;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ProjectEulerProblem13Test {

    private ProjectEulerProblem13 projectEulerProblem13;

    @Before
    public void setUp() {

        projectEulerProblem13 = new ProjectEulerProblem13();
    }

    @Test
    public void shouldReturnSolution() {

        System.out.println(projectEulerProblem13.solution(10));
    }
}
