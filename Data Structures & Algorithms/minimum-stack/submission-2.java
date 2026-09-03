class MinStack {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> min=new Stack<>();
    public MinStack() {
        Stack<Integer> stack=new Stack<>();
        Stack<Integer> min=new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        min.push(val);
    }
    
    public void pop() {
        stack.pop();
        min.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
         Collections.sort(min, Collections.reverseOrder());        
         return min.peek();
    }
}
