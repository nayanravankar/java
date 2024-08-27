package com.epam.core.javaeight.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCharCount {

    public static void main(String[] args) {

        String str = "asaassdssdffgs";


        Map<Character, Long> charCountMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(character -> character, Collectors.counting()));

        //not working
        Map<Object, Long> ch = str.chars()
                .boxed()
                .collect(Collectors.groupingBy(character -> character, Collectors.counting()));

        System.out.println(ch);
    }
}
