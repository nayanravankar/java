package com.epam.core.codility;

public class SlidingWindow {

    public static void main(String[] args) {

        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;

        maxSum(arr, k);

    }

    public static void maxSum(int arr[], int k){
        int len = arr.length;
        int max_count = Integer.MIN_VALUE;
        for (int i=0; i < len -k +1; i++){
            int sum =0;
            for (int j =0; j<k; j++){
                   sum = sum + arr[i+j];
            }
            if (sum > max_count) {
                max_count = sum;
            }

        }
        System.out.println("MAx sum of sub array "+max_count);

    }

}
