package com.epam.core.javaeight.string;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "abcabcarjsfsasf";

        Set<Character> set = new LinkedHashSet<>();

        String unique = str.chars()
                .mapToObj(c-> (char)c)
                .filter(c -> set.add(c))
                .map(character -> character.toString())
                .collect(Collectors.joining(""));

        System.out.println(unique);

    }
}
