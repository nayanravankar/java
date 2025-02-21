package com.epam.core.javaeight.program;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class SumEven {

    public static void main(String[] args) {

        IntSummaryStatistics intSummaryStatistics = IntStream.range(0, 5)
                .filter(i -> i % 2 == 0)
                .summaryStatistics();

        System.out.println(intSummaryStatistics.toString());
    }
}
