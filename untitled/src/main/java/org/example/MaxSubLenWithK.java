package org.example;

public class MaxSubLenWithK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 0, 0, 1, 1, 1, 1, 5, 6};
        int k = 4;
        int ans = check(arr, k);
        System.out.println(ans);
    }

    public static int check(int[] arr, int k) {
        int maxlen = 0;
        int sum = 0;
        int i = 0;
        int j = 0;
        int n = arr.length;
        while (j < n) {
            while (sum > k) {
                sum -= arr[i];
                i++;
            }
            if (sum == k) {
                maxlen = Math.max(maxlen, j - i + 1);
            }
            j++;
            if (j < n) {
                sum += arr[j];
            }
        }
        return maxlen;
    }
}
