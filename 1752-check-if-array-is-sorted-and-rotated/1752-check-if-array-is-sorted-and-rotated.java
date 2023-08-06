class Solution {
    public boolean check(int[] nums) {
        int temp=0;
        for(int i=1;i<nums.length;++i){
            if(temp==0){
                if(nums[i]<nums[i-1]){
                    temp=1;
                }
                if(temp==1){
                    if(nums[0]<nums[i]) return false;
                }
            }
            else{
                if(nums[0]<nums[i] || nums[i]<nums[i-1]) return false;
            }
        }
        return true;
    }
}