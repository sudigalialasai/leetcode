class Solution {
    public void csum(int[] nums,int target,List<Integer> l,List<List<Integer>> m,int i){
        if(target==0){
            m.add(new ArrayList<Integer>(l));
            return;
        }
        if(i>=nums.length || target<0) return;

        l.add(nums[i]);

        csum(nums,target-nums[i],l,m,i);

        l.remove(l.size()-1);

        csum(nums,target,l,m,i+1);



        
    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> m=new ArrayList<>();
        csum(candidates,target,new ArrayList<Integer>(),m,0);

        return m;
        
        
    }
}