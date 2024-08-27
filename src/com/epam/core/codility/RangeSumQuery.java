package com.epam.core.codility;

/*
* We have an array arr[]. We need to find the sum of all the elements in the range L and R where 0 <= L <= R <= n-1.
* Consider a situation when there are many range queries.
*
* Input : 3 7 2 5 8 9
        query(0, 5)
        query(3, 5)
        query(2, 4)
Output : 34
         22
         15
* */

public class RangeSumQuery {

    public static void main(String[] args) {

        int arr[] = {3,7,2,5,8,9};
        System.out.println(rangeSum(0,5,arr));
        System.out.println(rangeSum(3,5,arr));
        System.out.println(rangeSum(2,4,arr));


    }
    public static int rangeSum(int start, int end, int[] arr){
        int sum=0;
        for (int i=start; i<=end ; i++){
            sum=sum+arr[i];
        }

        return sum;
    }
}
