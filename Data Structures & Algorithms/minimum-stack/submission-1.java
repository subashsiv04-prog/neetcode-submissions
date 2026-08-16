class MinStack {
    Stack<Integer> stack = new Stack<>();  
    Stack<Integer> minStack = new Stack<>();
    public MinStack() {

    }
    
    public void push(int val) {
        this.stack.push(val);
        if (minStack.isEmpty()) {
            this.minStack.push(val);
        } else {
            if (minStack.peek() < val) {
                minStack.push(minStack.peek());
            } else {
                minStack.push(val);
            }
        }
    }
    
    public void pop() {
        this.stack.pop();
        this.minStack.pop();
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        return this.minStack.peek();
    }
}
