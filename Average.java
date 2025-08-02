public class Average {
    public void Avg(int[] nums)
    {
        double sum=0;
        for(int i=0;i<nums.length;i++){
sum+=nums[i];
        }
        double avg=sum/nums.length;
        System.out.println(avg);
    }
      public static void main(String[] args) {
        Average sm=new Average();
    int[] nums={1,2,4,1,5,3,4,6,4,6};
sm.Avg(nums);
    }
}
