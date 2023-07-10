class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int[] res=new int[nums2.length];
        
        for(int i=nums2.length-1;i>=0;--i){
            while(!st.empty() && st.peek()<=nums2[i]){
                st.pop();
            }
            if(!st.empty()){
                res[i]=st.peek();             
            }
            else{
                res[i]=-1;
            }
            st.push(nums2[i]);
        }
        int[] result=new int[nums1.length];
        for(int i=0;i<nums1.length;++i){
            for(int j=0;j<nums2.length;++j){
                if(nums1[i]==nums2[j]){
                    result[i]=res[j];
                }
            }

        }
        return result;
        
    }
}