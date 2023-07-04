class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        int low=m-1,current=n+m-1,high=n-1;

        while(low>=0 && high>=0){
            if(num1[low]>=num2[high]){
                num1[current]=num1[low];
                current--;
                low--;
            }
            else{
                 num1[current]=num2[high];
                current--;
                high--;

            }
        }

        for(int i=low;low>=0 && current>=0;--i){
            num1[current]=num1[i];
            current--;
        }
        for(int i=high;high>=0 && current>=0;--i){
            num1[current--]=num2[i];
        }
        
    }
}