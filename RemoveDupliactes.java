public class RemoveDupliactes {
    public void removedupli(int[] nums){
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                k++;
            }
        }
        System.out.println(k);
    }
      public static void main(String[] args) {
       RemoveDupliactes rd=new RemoveDupliactes();
    int[] nums={1,1,2,2,3,4,5,6};
rd.removedupli(nums);
    }
}
