package com.epam.core.javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapStream {

    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5,6,7};
        List<Integer> list =  Arrays.asList(arr);

        Function<Integer, Integer> mapDouble = (x)->(x*2);

        List<Integer> doubled = list.stream().map(mapDouble).collect(Collectors.toList());

        System.out.println(doubled);




    }
}
