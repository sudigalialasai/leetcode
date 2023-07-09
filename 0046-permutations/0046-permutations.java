class Solution {
    
    public void getperm(int[] nums,List<List<Integer>> l,int index){
        
              if (nums.length == index) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            l.add(permutation);
            return;
        }
 
        for(int i=index;i<nums.length;++i){
            int temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;

            getperm(nums,l,index+1);

            temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;



            
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();

        getperm(nums,l,0);
        return l;
        
    }
}