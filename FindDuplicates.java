import java.util.HashMap;

public class FindDuplicates {
    public void dupliii(int[] nums){
        int n=nums.length;
        HashMap<Integer,Integer> hash=new HashMap<>();

        for(int i=0;i<n;i++){
            if(hash.containsKey(nums[i])){
                System.out.println(nums[i]);
            }
            else{
                hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
            }
        }
    }
    public static void main(String[] args) {
        FindDuplicates fd=new FindDuplicates();
        int[] nums={4,16,10,3,8,12,10,21,11,13,19,2,7,5,8};
        fd.dupliii(nums);
    }
}
