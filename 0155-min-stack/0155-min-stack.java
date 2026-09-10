class MinStack {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minimums=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        stack.push(value);
        if(minimums.isEmpty() || value<minimums.peek()){
            minimums.push(value);
        } else{
            minimums.push(minimums.peek());
        }
        
    }
    
    public void pop() {
        stack.pop();
        minimums.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minimums.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */