package Solutions;
import java.util.*;

public class TopK {
    public static int[] topKFrequent(int[] nums,int k){
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Map.Entry<Integer,Integer>> entries=new ArrayList<>(map.entrySet());
        entries.sort((a,b)->b.getValue()-a.getValue());

        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=entries.get(i).getKey();
        }
        return result;

    }
    public static void main(String[] args) {
     
        System.out.println(Arrays.toString(topKFrequent(new int[]{1,1,1,2,2,3}, 2))); // [1,2]
        System.out.println(Arrays.toString(topKFrequent(new int[]{7,7}, 1)));
    }
    
}
