import java.util.Arrays;

public class Selectionsort {
    public void doselection(int[] nums){
int n=nums.length;
for(int i=0;i<n;i++){
    int min=Integer.MAX_VALUE;
     int minindex=Integer.MAX_VALUE;
     for(int j=i+1;j<n;j++){
        if(nums[j]<min){
            min=nums[j];
            minindex=j;
     }
}
if(min<nums[i]){
    int temp=nums[i];
    nums[i]=nums[minindex];
    nums[minindex]=temp;
    
}
    }
    System.out.println(Arrays.toString(nums));
}
   public static void main(String[] args) {
    Selectionsort ss=new Selectionsort();
    int[] nums={4,1,5,2,3};
    ss.doselection(nums);
   }
}
