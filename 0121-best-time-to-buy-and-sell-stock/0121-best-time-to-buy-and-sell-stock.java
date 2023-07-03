class Solution {
    public int maxProfit(int[] profit) {
        int min=profit[0];
        int result=0;

        for(int i=1;i<profit.length;++i){
            if(min>profit[i]){
                min=profit[i];
            }
            else{
                if(result<profit[i]-min){
                    result=profit[i]-min;
                }

            }

        }

        
      return result;
    }     
         
}