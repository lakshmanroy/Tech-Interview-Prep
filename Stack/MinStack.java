import java.util.Stack;

class MinStack {
    public  Stack<Integer> stack;
    public  Stack<Integer> minStack;

    // Constructor to initialize the stack and minStack
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push an element onto the stack and update the minStack
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    // Remove the top element from the stack and update the minStack
    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    // Get the top element of the stack
    public int top() {
        return stack.peek();
    }

    // Retrieve the minimum element in the stack
    public int getMin() {
        return minStack.peek();
    }

    // Main method to test MinStack functionality
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        
        System.out.println(minStack.getMin()); // Output: -3
        minStack.pop();
        System.out.println(minStack.top());    // Output: 0
        System.out.println(minStack.getMin()); // Output: -2
    }
}
