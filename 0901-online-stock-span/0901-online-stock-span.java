class StockSpanner {
    Stack<pair> st=new Stack<>();
    int count;

    public StockSpanner() {
        while(!st.empty()){
            st.pop();
        }
        count=0;
        
    }
    
    public int next(int price) {
            while(!st.empty() && st.peek().value<=price){
                st.pop();           
            }
            if(st.empty()){
            st.push(new pair(count++,price));
            return count;    
        }
            int res=st.peek().index;
            st.push(new pair(count++,price));
            return count-res-1; 
    }
}
class pair{
    int index,value;
    pair(int _index,int _value){
        index=_index;
        value=_value;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */