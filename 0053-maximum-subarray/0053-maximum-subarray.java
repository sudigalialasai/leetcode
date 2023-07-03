class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxsum=0;
        int temp=0;
        for(int i=0;i<nums.length;++i){
            if(sum+nums[i]>=0){
                sum=sum+nums[i];
                temp=1;
                
            }
            else sum=0;
            if(sum>maxsum){
                maxsum=sum;
                
            }
            
        }
        if(temp==1) return maxsum;
        maxsum=Integer.MIN_VALUE;
        if(temp!=1){
            for(int i=0;i<nums.length;++i){
                if(maxsum<nums[i]) maxsum=nums[i];

            }
        }
        return maxsum;
        
    }
}