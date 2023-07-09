class MyQueue {
     Stack<Integer> s=new Stack<>();
    Stack<Integer> q=new Stack<>();
    public MyQueue() {
        
        
    }
    
    public void push(int x) {
        s.push(x);
        
    }
    
    public int pop() {
        if(q.empty()){
             while(!s.empty()){
                 q.add(s.pop());
             }
             
         }
          return q.pop();
         
         
    }
    public int peek() {
        if(q.empty()){
             while(!s.empty()){
                 q.add(s.pop());
             }
             
         }
          return q.peek();
         
         
    }
        
        
    
    
    public boolean empty() {
        if(s.empty() && q.empty()) return true;
        else return false;
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */