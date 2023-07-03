class Solution {
    static void reverse(int a[], int n)
    {
        for(int i=0;i<n/2;++i){
            int temp=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=temp;
        }
    }
    public void nextPermutation(int[] nums) {
        int temp=-1;
        int var=-1;

        for(int i=nums.length-1;i>0;--i){
            if(nums[i]>nums[i-1]){
                temp=i-1;
                var=i;
                break;
            }
        }
        if(temp==-1 || var==-1) {

        reverse(nums,nums.length);
        return;}
       int check=var;
        for(int i=nums.length-1 ;i>temp;--i){
            if(nums[i]>nums[temp]){
                var=i;
                break;
            }
        }
       int a=nums[temp];
       nums[temp]=nums[var];
       nums[var]=a;

       int count=nums.length-temp;
       
       
       
       for(int i=0;i<count/2;++i){
          
           temp++;
           int b=nums[temp];
           nums[temp]=nums[nums.length-i-1];
           nums[nums.length-1-i]=b;

       }
      //return nums;
        
    }
}