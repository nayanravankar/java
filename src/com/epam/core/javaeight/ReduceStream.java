package com.epam.core.javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceStream {

    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5};
        List<Integer> lst = new ArrayList<>(Arrays.asList(arr));

        BinaryOperator<Integer> sum = (acc,input) -> {
            Integer sum1 = acc+input;
            System.out.println("acc - "+ acc + ", input - "+input+", return = "+sum1);
            return sum1;
        };

        System.out.println(lst.stream().reduce(sum).get());

        System.out.println("without ext - >"+lst.stream().reduce(1,(integer, integer2) -> {return integer*integer2;}));

    }
}
