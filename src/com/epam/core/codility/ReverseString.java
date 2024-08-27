package com.epam.core.codility;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Hello nayan1";
        int len = str.length();

        char[] arr = str.toCharArray();

        for (int i=0, j= len-1;
                i<j;
                i++, j--){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;


        }
        System.out.println(new String(arr));
    }
}
