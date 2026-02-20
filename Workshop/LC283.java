class Solution {
    public void moveZeroes(int[] nums) {
     int a;
     for (int i=0;i<nums.length;i++) {
        if(nums[i]==0){
            for (int j=i+1;j<nums.length;j++) {
            if(nums[j]!=0){
                a=nums[i];
                nums[i]=nums[j];
                nums[j]=a;
                break;
            }
        }
     }
    }
    }
}