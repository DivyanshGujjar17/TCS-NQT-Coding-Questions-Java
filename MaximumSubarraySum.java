public class MaximumSubarraySum {
    public void findsum(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i = 0; i < nums.length; i++){
            currentSum += nums[i];
            if(currentSum > maxSum){
                maxSum=currentSum;
            }
            else if(currentSum<0)
            {
                currentSum=0;
            }
        }
        System.out.println(maxSum);
    } 
    public static void main(String[] args) {
        MaximumSubarraySum mxb=new MaximumSubarraySum();
        int[] nums={-2,-3,4,-1,-2,1,5,3};
        mxb.findsum(nums);
    }
}
