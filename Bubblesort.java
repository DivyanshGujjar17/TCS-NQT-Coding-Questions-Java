import java.util.Arrays;

import javax.management.openmbean.ArrayType;

public class Bubblesort {
    public void findbubble(int[] nums){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        } 
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        Bubblesort bs=new Bubblesort();
        int[] nums={4,5,6,18,6,5,8};
        bs.findbubble(nums);

    }
}
 