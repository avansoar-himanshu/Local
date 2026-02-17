package org.example;

import java.util.Arrays;

public class SortArrOf_0_1_2 {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 1, 0, 2, 1, 0, 2, 1, 0, 2, 0, 0};
//        solve(arr);
        dutchNAtionALgo(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void dutchNAtionALgo(int[] arr) {
    int low=0;
    int mid=0;
    int high=0;
//    while ()

    }

    private static void solve(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count0++;
            else if (arr[i] == 1) count1++;
            else count2++;
        }
        System.out.println(count0 + " " + count1 + " " + count2);
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
//        System.out.println(Arrays.toString(arr));
        for (int i = count0; i < count1 + count0; i++) {
            arr[i] = 1;
        }
//        System.out.println(Arrays.toString(arr));
        for (int i = count0+count1; i < count2 + count0 + count1; i++) {
            arr[i] = 2;
        }
    }
}
