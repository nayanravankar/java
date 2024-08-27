package com.epam.core.javaeight.string;

import javax.print.attribute.IntegerSyntax;
import java.util.stream.IntStream;

public class Plaindrom {

    public static void main(String[] args) {

        String str = "racecar";

        Boolean bool = IntStream.range(0,str.length()/2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length()-i-1));

        System.out.println(bool);
    }
}
