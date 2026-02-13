import java.util.Arrays;
import java.util.HashMap;

public class LongestSubArrWithSum {
    public static void main(String[] args) {
//        Longest subarray with given sum K(positives)


        int[] arr = {10, 5, 2, 7, 1, 9};

        checkSum(arr, 15);
    }

    private static void checkSum(int[] arr, int k) {
        int n = arr.length;
        int len = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            prefixSum+=arr[i];
            map.put(len,prefixSum);

            if(prefixSum>k){

            }


        }


        int sum = Integer.MIN_VALUE;

        int left = 0;
        int right = 0;


    }
}
