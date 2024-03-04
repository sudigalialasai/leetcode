class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score=0;
        int maxScore=0;
        int i=0;
        int j=tokens.length;
        while(i!=j){
            int i_previous=i; int j_previous=j;
            if(tokens[i]<=power){
                score++;
                power=power-tokens[i];
                i++;
                
                if(score>maxScore) maxScore=score;
            }
             
            else{
                if(score>0){
                    score--;
                    j--;
                    power=power+tokens[j];
                }
            }
            
            if(i_previous==i && j_previous==j){
                return maxScore;
            }
            
            
        }
         return maxScore;
    }
    
}