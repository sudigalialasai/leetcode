class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][];
         for (int i = 0; i < triangle.size(); i++) {
                dp[i] = new int[triangle.get(i).size()];
              }

        dp[0][0]=triangle.get(0).get(0);
        for(int i=1;i<triangle.size();++i){
            for(int j=0;j<=i;++j){
                if(j==0){
                    dp[i][j]=dp[i-1][j]+triangle.get(i).get(j);
                }
                else if(i==j){
                    dp[i][j]=dp[i-1][j-1]+triangle.get(i).get(j);
                }
                else{
                    dp[i][j]=triangle.get(i).get(j)+Math.min(dp[i-1][j],dp[i-1][j-1]);
                }
            }
        }

        int min=Integer.MAX_VALUE;
        for(int i=0;i<triangle.size();++i){
            min=Math.min(min,dp[triangle.size()-1][i]);
        }

        return min;
          
    }

    
}