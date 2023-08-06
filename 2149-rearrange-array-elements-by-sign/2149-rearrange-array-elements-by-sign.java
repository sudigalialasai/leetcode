class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        
        int l=0,m=0;
        for(int i=0;i<n;++i){
            if(nums[i]>0){
                pos[l++]=nums[i];
            }
            else{
                neg[m++]=nums[i];
            }
        }
        l=0;m=0;
        for(int i=0;i<n;++i){
            if(i%2==0) nums[i]=pos[l++];
            else nums[i]=neg[m++];
        }
        
        return nums;
        
    }
}