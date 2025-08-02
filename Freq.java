import java.util.HashMap;
import java.util.Map;
public class Freq {
    public void str(int[] nums){
int n=nums.length;
HashMap<Integer,Integer> hash=new HashMap<>();
for(int i=0;i<n;i++){
    hash.put(nums[i], hash.getOrDefault(nums[i], 0)+1);
}
for(Map.Entry<Integer,Integer> ent:hash.entrySet()){
    System.out.println("key:"+ent.getKey()+" "+"value:"+ent.getValue());
}
    }
    public static void main(String[] args) {
        Freq fq=new Freq();
int[] nums={1,2,4,1,5,3,4,6,4,6};
fq.str(nums);

    }
}
