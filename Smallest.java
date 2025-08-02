
import java.util.Arrays;

public class Smallest {
public void findsmall(int[] nums){
    int n=nums.length;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
if(nums[i]<min){
min=nums[i];
}
    }
    System.out.println(min);
}
    public static void main(String[] args) {
        Smallest bh=new Smallest();
        int[] nums={2,8,3,1,8,4,5,6,5};
        bh.findsmall(nums);
    }
}