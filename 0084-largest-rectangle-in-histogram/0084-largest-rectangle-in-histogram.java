class Solution {
    public int largestRectangleArea(int[] heights) {
        int result=0;
        Stack<Integer> st = new Stack<>();
        int i=0;
        while(i<heights.length){
            if(st.empty()){
                st.push(i);
                i++;
            }
            else{
                if(heights[st.peek()]<heights[i]){
                    st.push(i);
                    i++;

                }
                else{
                    int temp=st.pop();
                    if(!st.empty()){
                        result=Math.max(result,(i-st.peek()-1)*heights[temp]);
        
                    }
                    else{
                        result=Math.max(result,(i)*heights[temp]);
                    }
                }
            }
        }
        int n=heights.length;
        while(!st.empty()){
            int temp=st.pop();
            if(!st.empty()){
                 result=Math.max(result,(n-st.peek()-1)*heights[temp]);
               
            }
            else{
                result=Math.max(result,(n)*heights[temp]);
            }

        }
        return result;
    }
}