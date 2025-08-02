public class sum {
    public void findsum(int[] nums){
int sum=0;
for(int i=0;i<nums.length;i++){
    sum+=nums[i];
}
System.out.println(sum);
    }
    public static void main(String[] args) {
        sum sm=new sum();
    int[] nums={1,2,4,1,5,3,4,6,4,6};
sm.findsum(nums);
    }
}
