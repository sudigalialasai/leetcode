class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int count1=0,count2=0;
        int res1=Integer.MIN_VALUE,res2=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;++i){
            if(count1==0 && res2!=nums[i]) {

            count1++;
            res1=nums[i];}
            else if(res1!=nums[i] && count2==0) {

            res2=nums[i];
            count2++;
            }
            else if(res1==nums[i]) count1++;
            else if(res2==nums[i]) count2++;
            else {
                count1--;
                count2--;
        }
        }
       
        int mid=(nums.length)/3+1;
        count1=0;
        count2=0;
       
        for(int i=0;i<nums.length;++i){
            if(res1==nums[i]) count1++;
              if(res2==nums[i]) count2++;
        }
        
        
        if(count1>=mid) l.add(res1);
         
        if(count2>=mid) l.add(res2);
       
        
        
        return l;
        
    }
    
}