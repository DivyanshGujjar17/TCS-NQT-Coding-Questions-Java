import java.util.Arrays;

public class Reverse {
    public void doreverse(int[] nums){
        int n=nums.length;
        for(int i=0;i<n/2;i++){
            int temp=nums[i];
            nums[i]=nums[n-i-1];
            nums[n-i-1]=temp;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        Reverse rv=new Reverse();
        int[] arr={1,2,3,4,5};
        rv.doreverse(arr);
    }
}
