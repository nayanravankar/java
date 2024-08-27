package com.epam.core.javaeight.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagrams {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        //compare both array woth index

         boolean flag = compareArray(ch1,ch2);
        System.out.println("both String Anagrams - "+flag);


        System.out.println(usingLambdaFun(str1,str2));

    }

    public static boolean usingLambdaFun(String str1, String str2){

        String sorted1 = str1.chars()
                .sorted()
                .mapToObj(c -> (char) c)
                .map(String::valueOf)
                .collect(Collectors.joining());

        String sorted2 = str2.chars()
                .sorted()
                .mapToObj(c -> (char) c)
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println("sorted1 = "+sorted1 +", sorted2 = "+sorted2);


        return sorted1.equals(sorted2);
    }
    public static boolean compareArray(char[] ch1, char[] ch2){
        int len = ch1.length;
        for (int i=0; i<len;i++){
            if (ch1[i] != ch2[i]){
                return false;
            }
        }
        return true;
    }

}
