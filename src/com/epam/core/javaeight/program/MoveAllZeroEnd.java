package com.epam.core.javaeight.program;

import java.util.Arrays;

public class MoveAllZeroEnd {

    public static void main(String[] args) {

        Integer arr[] = {1, 2, 0, 4, 3, 0, 5, 0};

        usingTraditionalLoop(arr);
        usingLambda(arr);
    }

    private static void usingTraditionalLoop(Integer[] arr) {
        int count=0;
        for (int i = 0; i< arr.length; i++){

            if (arr[i]!=0){
                arr[count++] = arr[i];
            }
        }
        while(count< arr.length){
            arr[count++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void usingLambda(Integer[] arr) {

        Integer index = Arrays.stream(arr)
                .filter(val -> val != 0)
                .reduce(0, (i, val) -> {
                    arr[i] = val;
                    return i+1;
                });

        Arrays.fill(arr,index,arr.length,0);

        System.out.println(Arrays.toString(arr));
    }
}
