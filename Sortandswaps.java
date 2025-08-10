import java.util.Arrays;

public class Sortandswaps {
    public void bubblessort(int[] nums){
int n=nums.length;
int comparision=0;
int compare=n-1;
comparision=compare*(compare+1)/2;
System.out.println(comparision);
int swaps=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swaps++;
                }
            }
        } 
  System.out.println(Arrays.toString(nums));
  System.out.println(swaps);
    }
    public static void main(String[] args) {
        Sortandswaps sas=new Sortandswaps();
        int[] nums={12,7,5,19,8,3};
        sas.bubblessort(nums);
    }
}
