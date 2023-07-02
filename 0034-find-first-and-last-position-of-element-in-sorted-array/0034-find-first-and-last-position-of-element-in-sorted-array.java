 class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        int start = 0;
        int end = nums.length - 1;

        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                res[0] = mid;
                end = mid - 1;  
            }
        }

       
        if (res[0] == -1) {
            return res;
        }

        start = 0;
        end = nums.length - 1;

     
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                res[1] = mid;
                start = mid + 1;  
            }
        }

        return res;
    }
}
