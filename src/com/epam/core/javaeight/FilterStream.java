package com.epam.core.javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterStream {

    public static void main(String[] args) {

        String[] arr = {"hello", "Advika", "Java", "ravankar", "Helloworld!!"};

        List<String> lst = new ArrayList<>(Arrays.asList(arr));

        //filter list string lenght more than give number

        Predicate<String> strGrt5 = x->x.length()>5;
        List<String> lst5 = lst.stream()
                            .filter(strGrt5)
                            .collect(Collectors.toList());

        System.out.println(lst5);

        //tomake generic use function interface
        // first param input int, second output expected boolean
        Function<Integer,Predicate<String>> fun = x->{
            return str->str.length()>x;
        };

        List<String> out = lst.stream()
                .filter(fun.apply(4))
                .collect(Collectors.toList());

        System.out.println(out);
    }
}
