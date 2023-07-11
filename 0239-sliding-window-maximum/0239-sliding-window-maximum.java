class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> d=new ArrayDeque<>();
        int count=0;
        int[] result=new int[nums.length-k+1];

        for(int i=0;i<nums.length;++i){
            if(!d.isEmpty() && d.peekFirst()==i-k) d.removeFirst();

            while(!d.isEmpty() && nums[d.peekLast()]<=nums[i]) d.removeLast();

            d.addLast(i);
            if(i-count==k-1) result[count++]=nums[d.peekFirst()];
        }

        

        return result;
        
    }
}