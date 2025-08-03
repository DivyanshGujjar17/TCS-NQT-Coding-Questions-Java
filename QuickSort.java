import java.util.Arrays;

public class QuickSort {
    public void quick(int[] nums){
        int n=nums.length;
        qsort(nums,0,n-1);
        System.out.println(Arrays.toString(nums));
    }
    public void qsort(int[] nums,int start,int end){
if(start>=end){
    return;
}
int pivotindex=partition(nums, start, end);
qsort(nums,start, pivotindex-1);
qsort(nums,pivotindex+1,end);

    }
    public int partition(int[] nums,int start,int end){
        int pivot=nums[end];
        int idx=start;
        for(int i=start;i<end;i++){
            if(nums[i]<pivot){
                int temp=nums[idx];
                nums[idx]=nums[i];
                nums[i]=temp;
                idx++;
            }
        }
        int temp=nums[end];
        nums[end]=nums[idx];
        nums[idx]=temp;
        return idx;
    }
    public static void main(String[] args) {
        QuickSort qs=new QuickSort();
        int[] nums={7,8,5,5,1,39,9};
qs.quick(nums);
    }
}
