class MyStack {

    //Pop effiecient Time Complexity 
    //Push  ---> O(n)
    //Pop   ---> O(1)
    //top   ---> O(1)


    Queue<Integer> q = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        if(q.size() == 0){
            q.add(x);
        }
        else{
            q.add(x);
            for(int i = 1; i <= q.size() - 1; i++){
                q.add(q.remove());
            }
        }
    }
    
    public int pop() {
        int ans = q.remove();
        return ans;
    }
    
    public int top() {
        int ans = q.peek();
        return ans;
    }
    
    public boolean empty() {
        if(q.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */