import java.util.HashMap;

public class Subset {
    public void Finding(int[] nums1,int[] nums2){
int n=nums1.length;
int m=nums2.length;
HashMap<Integer,Integer> hash=new HashMap<>();
for(int i=0;i<n;i++){
hash.put(nums1[i],hash.getOrDefault(nums1[i],0)+1);
}
boolean valid=true;
for(int i=0;i<m;i++){
   if (hash.containsKey(nums2[i]) && hash.get(nums2[i]) > 0) {
                hash.put(nums2[i], hash.get(nums2[i]) - 1);
            } else {
                valid = false;
                break;
            }
}
System.out.println(valid);

    }
    public static void main(String[] args) {
        Subset sb=new Subset();
        int[] nums1={1,4,5,5,2,3,7};

        int[] nums2={5,5,2,3};
        sb.Finding(nums1,nums2);
    }
}
