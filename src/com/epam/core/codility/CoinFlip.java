package com.epam.core.codility;

/*
*
* Min no of coin flip to make alternative pattern of 1,0,1,0
*
*  1 = head
*  0 - tail
*
* */

import java.util.Arrays;

public class CoinFlip {

    public static void main(String[] args) {

        //int arr[] = {1,0,1,0,1,1};
        int arr[] = {1,1,0,1,1};
        int len = arr.length;

        // create two temp array of same size one starts with head and other with tail

        int head[] = new int[len];
        int tail[] = new int[len];

        for (int i=0; i<len; i++){
            if (i%2 == 0){
                head[i] = 1;
                tail[i] = 0;
            }else {
                head[i] = 0;
                tail[i] = 1;
            }

            }

        System.out.println("heads array - "+ Arrays.toString(head));
        System.out.println("tails array - "+ Arrays.toString(tail));

        // now compare both with input array and check diffrence

        int headDiff = 0, tailDiff=0;

        for (int i=0; i<len; i++){
            if (arr[i]!=head[i]){
                headDiff++;
            }
            if (arr[i]!=tail[i]){
                tailDiff++;
            }
        }
        // return min difference
        System.out.println("head diff - "+headDiff);
        System.out.println("tail diff - "+tailDiff);


    }



}
