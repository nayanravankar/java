package com.epam.core.codility;

/*
*
* A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

S is empty;
S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, the string "{[()()]}" is properly nested but "([)()]" is not.

Write a function:

class Solution { public int solution(String S); }

that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..200,000];
string S is made only of the following characters: '(', '{', '[', ']', '}' and/or ')'.
*
* */

import java.util.Stack;

public class Brackets {

    public static void main(String[] args) {
        String s = "{[(as)sss(as)]}";
        char[] ch = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        char lastChar = 0;

        for (int i=0; i<ch.length; i++){
            if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[' ){
                stack.push(ch[i]);
                //update last char
            }
            if (ch[i] == ')' || ch[i] == '}' || ch[i] == ']' ){
                    stack.pop();
            }
        }

        System.out.println(stack.size());

    }
}
