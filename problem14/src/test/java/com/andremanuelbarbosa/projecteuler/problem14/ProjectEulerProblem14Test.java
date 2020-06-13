package com.andremanuelbarbosa.projecteuler.problem14;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ProjectEulerProblem14Test {

    private ProjectEulerProblem14 projectEulerProblem14;

    @Before
    public void setUp() {

        projectEulerProblem14 = new ProjectEulerProblem14();
    }

    @Test
    public void shouldReturnSolution() {

        final List<Long> sequenceStartingWith13 = new ArrayList<Long>(10);
        sequenceStartingWith13.add(13l);
        sequenceStartingWith13.add(40l);
        sequenceStartingWith13.add(20l);
        sequenceStartingWith13.add(10l);
        sequenceStartingWith13.add(5l);
        sequenceStartingWith13.add(16l);
        sequenceStartingWith13.add(8l);
        sequenceStartingWith13.add(4l);
        sequenceStartingWith13.add(2l);
        sequenceStartingWith13.add(1l);

        assertEquals(sequenceStartingWith13, projectEulerProblem14.getSequence(13));

        System.out.println(projectEulerProblem14.solution(1000000));
    }
}
