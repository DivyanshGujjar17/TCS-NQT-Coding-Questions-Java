public class Equillibrium {
    public void findEqual(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int currentsum=nums[0];
        for(int i=1;i<nums.length;i++){
if(currentsum==sum-currentsum-nums[i]){
    System.out.println(i);
    break;
}
currentsum+=nums[i];

        }
    }
    public static void main(String[] args) {
        Equillibrium eq=new Equillibrium();
        int[] nums={1,2,3,1,4,2};
        eq.findEqual(nums);
    }
}
