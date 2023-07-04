class Solution {
    public int[][] merge(int[][] intervals) {
        for(int i=0;i<intervals.length;++i){
           
            for(int j=i;j<intervals.length;++j){
                if(intervals[i][0]>intervals[j][0]){
                    int temp=intervals[i][0];
                    intervals[i][0]=intervals[j][0];
                    intervals[j][0]=temp;

                    temp=intervals[i][1];
                    intervals[i][1]=intervals[j][1];
                    intervals[j][1]=temp;
                }
                else if(intervals[j][0]==intervals[i][0]){
                    if(intervals[j][1]>intervals[j][1]){
                        int temp=intervals[i][0];
                        intervals[i][0]=intervals[j][0];
                        intervals[j][0]=temp;

                        temp=intervals[i][1];
                        intervals[i][1]=intervals[j][1];
                        intervals[j][1]=temp;
                    }
                }
            }
        }
        int[][] result=new int[intervals.length][2];
        result[0][0]=intervals[0][0];
        result[0][1]=intervals[0][1];
        int count=0;

        for(int i=1;i<intervals.length;++i){
           if(result[count][1]>=intervals[i][1]) continue;
           else if(result[count][1]>=intervals[i][0]) result[count][1]=intervals[i][1];
           else{
               count++;
               result[count][0]=intervals[i][0];
               result[count][1]=intervals[i][1];
           }
        }
        //return result;

        int[][] r=new int[count+1][2];
        for(int i=0;i<=count;++i){
            r[i][0]=result[i][0];
            r[i][1]=result[i][1];


        }

        return r;
        
    }

}