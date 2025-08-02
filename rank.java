import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class rank {
    public void findrank(int[] nums){
int n=nums.length;
int[] newnums=new int[n];
for(int i=0;i<n;i++){
    newnums[i]=nums[i];
}
Arrays.sort(newnums);
HashMap<Integer,Integer> hash=new HashMap<>();
int currentrank=1;
for(int i=0;i<n;i++){
    if(hash.containsKey(newnums[i])){
        continue;
    }
    else{      
         hash.put(newnums[i],currentrank);
currentrank++;
    }
}
for(int i=0;i<n;i++){
    int currentvalue=hash.get(nums[i]);
    nums[i]=currentvalue;
}
System.out.println(Arrays.toString(nums));

    }
    public static void main(String[] args) {
        rank op=new rank();
        int[] nums={11,5,6,7,8,8,2};
        op.findrank(nums);
    }
}
