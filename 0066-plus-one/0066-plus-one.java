class Solution {
    public int[] plusOne(int[] digits) {
       int add=1;
       for(int i=digits.length-1;i>=0;i--){
           if(digits[i]==9){
               digits[i]=0;
              
           }
           else{
               digits[i]++;
               add=0;
           }
           if(add==0) return digits;
       }
       
    
    
    int[] result=new int[digits.length+1];
    result[0]=1;
    
    for(int i=0;i<digits.length;++i){
        result[i+1]=digits[i];
    }
        return result;
    }
}