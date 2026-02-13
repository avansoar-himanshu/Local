package DS;


import java.util.Arrays;
import java.util.HashMap;

public class Three {
    public static void main(String[] args) {
        int []arr= {1,3,5,7,2,6,8,2};

        System.out.println(Arrays.toString(sum(arr,7)));

    }

    private static int[] sum(int[] arr, int target) {


        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i <arr.length-1 ; i++) {
        int comp= target- arr[i] - arr[i+1];

        if(map.containsKey(comp)){
            return new int[] {map.get(comp),i,i+1,};
        }
        if(comp>0) map.put(comp,i);

        }
        return  new int[] {0,0,0};
    }


}
