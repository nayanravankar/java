package com.epam.core.javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamLazyLoad {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> integerStream = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> {
                    System.out.println("in map operations");
                    return n * 2;
                });

        System.out.println("After all intermediate operations");

        System.out.println(integerStream.toList());
    }
}
