package DS;

import java.util.ArrayList;
import java.util.List;

public class Kadane {
    public static void main(String[] args) {


        int[] arr = {-1, 3, -3, 4, 5, -6, -2, 3};
        int ans = maxSubArr(arr);
        System.out.println("MAX SUM OF SUBARR IS " + ans);

    }

    public static int maxSubArr(int[] arr) {


        int max = Integer.MIN_VALUE;
        List<Integer> subarr = new ArrayList<>();
        /*
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                max = Math.max(sum, max);

//                if(sum>max)subarr.add(arr[j]);
            }
        }
        */

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
                sum += arr[i];
                max = Math.max(sum, max);
                if(sum<0){
                    sum=0;
                }
//                if(sum>max)subarr.add(arr[j]);
        }


        return max;
    }
}
