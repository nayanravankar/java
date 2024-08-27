package com.epam.core.codility;

public class Palindrom {

    public static void main(String[] args) {

        String s = "nayan";

        char[] arr = s.toCharArray();
        int len = arr.length;
        for (int i=0, j=len-1; i<len/2; i++, j--){
                if (arr[i] != arr[j]){
                    System.out.println("Not palindrom string");
                    break;
                }
                else {
                    System.out.println("Palindrom");
                }

        }
    }
}
