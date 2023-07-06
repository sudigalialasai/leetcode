class Solution {
    public int trap(int[] height) {
        int[] rightmax = new int[height.length];
        int right = 0;
        for (int i = 0; i < height.length; ++i) {
            right = Math.max(right, height[i]);
            rightmax[i] = right;
        }
        
        int[] leftmax = new int[height.length];
        int left = 0;
        for (int i = height.length - 1; i >=0; --i) {
            left = Math.max(left, height[i]);
            leftmax[i] = left;
        }
        
        int result = 0;
        for (int i = 0; i < height.length; ++i) {
            result += Math.max(0, Math.min(leftmax[i], rightmax[i]) - height[i]);
        }
        
        return result;
    }
}
