import java.util.Arrays;

public class SecLargeSmall {
    public void sec(int[] nums){
        int n=nums.length;
int second=Integer.MAX_VALUE;
int first=Integer.MAX_VALUE;
for(int i=0;i<n;i++){
   if(nums[i]<first){
    second=first;
    first=nums[i];
   }
   else if(nums[i]<second&&nums[i]>first){
    second=nums[i];
   }
}
System.out.println(first);
System.out.println(second);
}
public static void main(String[] args) {
    SecLargeSmall hg=new SecLargeSmall();
    int[] nums={1,1};


    hg.sec(nums);
}
}
