package com.epam.core.javaeight.string;

import java.util.Map;
import java.util.stream.Collectors;

public class PalindromCheck {

    public static void main(String[] args) {

        validatePalindromStr("acabbww");


    }

    public static void validatePalindromStr(String str){
        Map<Character, Long> map = str.chars()
                .mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(ch->ch,Collectors.counting()));

        Long oddCount = map.values().stream()
                .filter(count-> count%2!=0)
                .count();

        if (str.length()%2==0){
            //odd count should be 0
            if (oddCount>0){
                System.out.println("No");
            }
            else{
                System.out.println("yes");
            }
        }
        else{
            if (oddCount==1){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }

    }
}
