 class Solution {
    public int uniquePaths(int m, int n) {
        int k = m + n - 2;  
        int l = Math.min(m, n) - 1;  
        long result = 1;  

        for (int i = 1; i <= l; ++i) {
            result = result * (k - l + i) / i;
        }

        return (int) result;
    }
}
