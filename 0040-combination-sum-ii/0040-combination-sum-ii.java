class Solution {

     public void csum(int[] nums,int target,List<Integer> l,List<List<Integer>> m,int j){
        if(target==0){
            m.add(new ArrayList<Integer>(l));
            return;}
        if(nums.length<=j) return;
        if(target<0) return;
        for(int i=j;i<nums.length;++i){

            if(i==j || nums[i]!=nums[i-1]){
                l.add(nums[i]);
                csum(nums,target-nums[i],l,m,i+1);
                l.remove(l.size()-1);}} }
       
     public List<List<Integer>> combinationSum2(int[] candidates, int target) {                  List<List<Integer>> m=new ArrayList<>();
        Arrays.sort(candidates);
        csum(candidates,target,new ArrayList<Integer>(),m,0);

        return m;
        
    }
}