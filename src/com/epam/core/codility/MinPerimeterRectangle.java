package com.epam.core.codility;


/*
* An integer N is given, representing the area of some rectangle.

The area of a rectangle whose sides are of length A and B is A * B, and the perimeter is 2 * (A + B).

The goal is to find the minimal perimeter of any rectangle whose area equals N. The sides of this rectangle should be only integers.

For example, given integer N = 30, rectangles of area 30 are:

(1, 30), with a perimeter of 62,
(2, 15), with a perimeter of 34,
(3, 10), with a perimeter of 26,
(5, 6), with a perimeter of 22.
Write a function:

class Solution { public int solution(int N); }

that, given an integer N, returns the minimal perimeter of any rectangle whose area is exactly equal to N.

For example, given an integer N = 30, the function should return 22, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..1,000,000,000].
* */
public class MinPerimeterRectangle {

    public static void main(String[] args) {
        int area = 30;
        int minPerimeter = Integer.MAX_VALUE;
        int a =0, b=0;
        for (int i=1; i<=area/2 ; i++){
            if (area%i == 0 && a<=b){
                 a = i;
                 b = area/i;
                int peri = perimeter(a,b);
                if (peri < minPerimeter){
                    minPerimeter = peri;
                }
            }
        }
        System.out.println("Min Perimeter - "+minPerimeter);

    }

    public static  int perimeter(int a, int b){
        return 2*(a+b);
    }
}
