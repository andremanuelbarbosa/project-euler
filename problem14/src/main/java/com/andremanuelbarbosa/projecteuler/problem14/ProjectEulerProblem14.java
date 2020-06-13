package com.andremanuelbarbosa.projecteuler.problem14;

import java.util.LinkedList;
import java.util.List;

public class ProjectEulerProblem14 {

    private long getNext(long number) {

        if (number % 2 == 0) {

            return number / 2;

        } else {

            return 3 * number + 1;
        }
    }

    protected List<Long> getSequence(long number) {

        final List<Long> sequence = new LinkedList<Long>();

        long next = number;

        while (next > 1) {

            sequence.add(next);

            next = getNext(next);
        }

        sequence.add(1l);

        return sequence;
    }

    public long solution(long maxStartingNumber) {

        long longestSequenceLength = 0;
        long longestSequenceNumber = 1;

        for (long i = 1; i < maxStartingNumber; i++) {

            final List<Long> sequence = getSequence(i);

            if (sequence.size() > longestSequenceLength) {

                longestSequenceNumber = i;
                longestSequenceLength = sequence.size();
            }
        }

        return longestSequenceNumber;
    }
}
