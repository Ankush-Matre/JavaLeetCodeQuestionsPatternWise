class MinStack {
    Stack<Long>st = new Stack<>();
    long min = -1;
    
    public MinStack() {
        
    }
    
    public void push(int val) {
        long x = (long)val;
        if(st.size() == 0){
            st.push(x);
            min = x;
        }
        else if(min <= x){
            st.push(x);
        }
        else if(x < min){
            st.push(2 * x - min);
            min = x;
        }
    }
    
    public void pop() {
        
        if(st.size() == 0){
            return;
        }
        else if(st.peek() >= min){
            st.pop();
        }
        else{
            //manje fake value detect zali
            long oldValue = 2 * min - st.peek();
            min = oldValue;
            st.pop();
        }
    }
    
    public int top() {
        long peek = st.peek();
        if(st.size() == 0){
            return -1;
        }
        else if(min > peek){
            return (int)min;
        }
        else{
            return (int)peek;
        }
    }
    
    public int getMin() {
        if(st.size() == 0){
            return -1;
        }
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */