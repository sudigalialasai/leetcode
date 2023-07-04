class Solution {
    public int missingNumber(int[] nums) {
        int[] n=new int[nums.length+1];
       for(int i=0;i<nums.length+1;++i){
           n[i]=0;

       }
       for(int i=0;i<nums.length;++i){
           n[nums[i]]=1;
       }
       int i;
       for(i=0;i<nums.length+1;++i){
           if(n[i]==0) {

           break;
           }
           
       }
        return i;
    }
}