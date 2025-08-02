import java.util.Currency;
import java.util.HashMap;

public class Symmetric {
    public void findsymmetric(int[][]nums){
HashMap<String,int[]> hash=new HashMap<>();
for(int i=0;i<nums.length;i++){
    int a=nums[i][1];
    int b=nums[i][0];
    String current=a+" "+b;
    if(hash.containsKey(current)){
        System.out.println(current);
        hash.remove(current);
    }
    else{
        String curr=b+" "+a;
        hash.put(curr,new int[]{b,a});
    }
}
    }
    public static void main(String[] args) {
        Symmetric sm=new Symmetric();
        int[][] nums={{1,2},{2,1},{2,1},{4,5},{5,4},{3,4}};
        sm.findsymmetric(nums);
    }
}
