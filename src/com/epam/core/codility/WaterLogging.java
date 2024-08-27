package com.epam.core.codility;


/*
* Calculte the highest area(l*h) where as length would be the elements of the array(i.e. 1,8,6... as given below) and height will be distance of
highest
Problem given below in detailed.
Given n non-negative integers a_1, a_2, ..., a_n where each represents a point at coordinate (i, a_i)‘ n ‘ vertical lines are drawn such that the two endpoints of line i is at (i, a_i) and (i, 0).
                 .
Find two lines, which together with x-axis forms a container, such that the container contains the most water.
The program should return an integer which corresponds to the maximum area of water that can be contained (maximum area instead of maximum volume sounds weird but this is the 2D plane we are working with for simplicity).
Input: array = [1, 5, 4, 3]
Output: 6
Explanation :
5 and 3 are distance 2 apart.
So the size of the base = 2.
Height of container = min(5, 3) = 3.
So total area = 3 * 2 = 6

Input: array = [3, 1, 2, 4, 5]
Output: 12
Explanation :
5 and 3 are distance 4 apart.
So the size of the base = 4.
Height of container = min(5, 3) = 3.
So total area = 4 * 3 = 12

*
* 3, 1, 6, 4, 5
* */
public class WaterLogging {

    public static void main(String[] args) {

        int arr[] = {3, 1, 6, 4, 5};
        calculateWaterLoggingArea(arr);
    }
    public static void calculateWaterLoggingArea(int[] arr){

        int length = arr.length;
        int area = 0;
        int firstWall = 0, secondWall=0;

        for (int i=0; i<length-1; i++){
            int base=1;
            int first = arr[i];
            for (int j=i+1; j<length; j++){
                int second = arr[j];
                int height = Math.min(first,second);
                int tempArea = base*height;
                if (area<tempArea){
                    area=tempArea;
                    firstWall=arr[i];
                    secondWall=arr[j];
                }
                base++;
            }
        }
        System.out.println("First wall - "+ firstWall);
        System.out.println("Second wall - "+ secondWall);
        System.out.println("Area - "+ area);

    }
}
