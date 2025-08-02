import java.util.Arrays;

public class IncresingDecreasing {
    public void changearr(int[] nums){
        int n=nums.length;
         Arrays.sort(nums);
        int half=n/2;
        int currentlength=(half+n-1)/2;
        int changelength=n-1;
        for(int i=half;i<=currentlength;i++){
            int temp=nums[i];
            nums[i]=nums[changelength];
            nums[changelength]=temp;
            changelength--;
        }
        System.out.println(currentlength);
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        IncresingDecreasing id=new IncresingDecreasing();
        int[] nums={5,6,1,7,2,3,4,8};
        id.changearr(nums);
    }
}
