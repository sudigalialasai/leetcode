class Solution {
    public void recur(int nums[],int j,List<List<Integer>> l,List<Integer> m){
        l.add(new ArrayList<Integer> (m));
        for(int i=j;i<nums.length;++i){
            if(i>j && nums[i]==nums[i-1]) continue;
            else{
                m.add(nums[i]);
                recur(nums,i+1,l,m);
                
                m.remove(m.size()-1);
                
            }
        }
         

    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l=new ArrayList<>();
        recur(nums,0,l,new ArrayList<Integer>());

        return l;
        

         
        }
    }
