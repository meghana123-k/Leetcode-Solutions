class MinStack {
    public Stack<Integer> stk;
    public Stack<Integer> minstk;
    public MinStack() {
        stk = new Stack<>();
        minstk = new Stack<>();
    }
    
    public void push(int val) {
        stk.push(val);
        if(minstk.isEmpty() || minstk.peek() >= val) {
            minstk.push(val);
        }
    }
    
    public void pop() {
        int popped = stk.pop();
        if(popped == minstk.peek()) {
            minstk.pop();
        }
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minstk.peek();
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