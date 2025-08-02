import java.util.HashMap;
import java.util.Map;

public class FindRepeating {
public void repeat(int[] nums){
    int n=nums.length;
    HashMap<Integer,Integer> hash=new HashMap<>();
    for(int i=0;i<n;i++){
        hash.put(nums[i], hash.getOrDefault(nums[i],0)+1);
    }
    for(Map.Entry<Integer,Integer> entry:hash.entrySet()){
        int key=entry.getKey();
        int value=entry.getValue();
        if(value>1){
            System.out.println(key);
        }
    }

} 
public static void main(String[] args) {
    FindRepeating fr=new FindRepeating();
      int[] nums={1,1,2,2,3,4,5,6,7,7,7};
    fr.repeat(nums);
}
}
