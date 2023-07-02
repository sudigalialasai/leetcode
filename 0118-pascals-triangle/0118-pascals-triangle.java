class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<numRows;++i){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<=i;++j){
                int value=ncr(i,j);
                temp.add(value);
     
            }
            l.add(temp);
        }
        return l;

        
    }
    public int ncr(int n,int r){
        int res=1;
          
        for(int i=0;i<r;++i){ 
            res=res*(n-i);
            res=res/(i+1);

        }
        return res;
    }
}