 import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        
        HashSet<Integer> h = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            h.add(nums[i]);
        }
        
        int longestCount = 0;
        for (int num : h) {
            if (!h.contains(num - 1)) {  // Check if num is the starting point
                int currentNum = num;
                int count = 1;

                while (h.contains(currentNum + 1)) {  // Increment currentNum until the next consecutive element exists
                    currentNum++;
                    count++;
                }

                longestCount = Math.max(longestCount, count);
            }
        }

        return longestCount;
    }
}
