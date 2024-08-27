package com.epam.core.javaeight.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWord {

    public static void main(String[] args) {

        String str = "Hello nayan how are you";

        String reverse = Arrays.stream(str.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(reverse);
    }
}
