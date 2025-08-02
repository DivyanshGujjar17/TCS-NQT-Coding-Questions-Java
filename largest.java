public class largest {
    public void findlarge(int[] nums){
    int n=nums.length;
    int max=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
if(nums[i]>max){
max=nums[i];
}
    }
    System.out.println(max);
}
    public static void main(String[] args) {
     largest lk=new largest();
        int[] nums={2,8,3,1,8,4,5,6,5};
        lk.findlarge(nums);
    }
}
