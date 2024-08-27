package com.epam.core.javaeight;

import java.util.stream.IntStream;

public class MultipleOf5 {

    public static void main(String[] args) {

        IntStream.range(1,10).forEach(
                value -> System.out.println(value*5)
        );
    }
}
