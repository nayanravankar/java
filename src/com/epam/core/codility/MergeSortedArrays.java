package com.epam.core.codility;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {

        int a[] = {2,4,6,7,8};
        int b[] = {1,3,5,8,9,10};

        int out[] = new int[a.length + b.length];

        int i=0, j=0, k=0;

        while ( i < a.length && j < b.length){

            if (a[i] >= b[j]){
                out[k++] = b[j++];
            }
            else {
                out[k++] = a[i++];
            }

        }

        while (i < a.length){
            out[k++] = a[i++];
        }


        while (j < b.length){
            out[k++] = b[j++];
        }

        System.out.println(Arrays.toString(out));

    }

}
