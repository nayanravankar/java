package com.epam.core.javaeight.string;

import java.util.Map;
import java.util.stream.Collectors;

public class CountVovelAndConsonantInString {
    public static void main(String[] args) {

        String str = "Hello Nayan";

        Map<String,Long > map = str.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(character -> "AEIOUaeiou".indexOf(character) != -1 ? "vovels" : "const",
                            Collectors.counting()));

        System.out.println(map);

    }
}
