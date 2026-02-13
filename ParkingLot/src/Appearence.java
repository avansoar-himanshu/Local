import java.util.HashMap;
import java.util.Map;

public class Appearence {
    public static void main(String[] args) {
        int [ ]arr = {1,2,4,5,4,5,2};
        checkarr(arr);
    }

    private static void checkarr(int[] arr) {


        Map<Integer,Integer> ans= new HashMap<>();
        for (int ele: arr){
            if(!ans.containsKey(ele)){
                ans.put(ele,1);
            }else {
                ans.put(ele,ans.getOrDefault(ele,0)+1);
            }
        }
//        System.out.println(ans);

        for (Map.Entry<Integer,Integer> e:ans.entrySet()){
            if(e.getValue()<=1){
                System.out.println(e.getValue());
            }
        }
    }
}
