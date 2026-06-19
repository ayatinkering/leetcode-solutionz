class MinStack {
    Deque<Integer> stk = new ArrayDeque<>();
    Deque<Integer> minstk = new ArrayDeque<>();

    public MinStack() { 
        //deque is an INTERFACE not a CLASS
    }
    
    public void push(int value) {
        stk.push(value);
        if(minstk.isEmpty()){ //first ele of stk, so it is min
            minstk.push(value);
        }
        else{
            minstk.push(Math.min(value, minstk.peek())); //MIN is pushed into minstk
        }
    }
    
    public void pop() {
        stk.pop(); minstk.pop();
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
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */