package com.epam.core.codility;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int rotation = 9;
        int len = arr.length;

        if (rotation > len)  {
            rotation = rotation% len;
        }
        int[] rotatedArr = new int[len];

        int pos = 0;

        for (int i=0; i < len; i++) {

            if ((rotation + i) > len-1){
                pos = rotation + i - len;
            }
            else{
              pos = rotation + i;
            }

            rotatedArr[pos]=arr[i];
        }
        System.out.println(Arrays.toString(rotatedArr));

    }
}
