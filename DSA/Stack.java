public class Stack {
    private int maxSize;
    private int[] stack;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stack = new int[size];
        top = -1;
    }

    void push(int element) {
        if (isStackFull()) {
            System.out.println("Stack overflow!");
            return;
        }
        System.out.println("Added: " + element);
        stack[++top] = element;
    }

    int pop() {
        if (isStackEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top--];
    }

    int peek() {
        if (isStackEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }

    boolean isStackFull() {
        return (top == maxSize - 1);
    }

    boolean isStackEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        stack.push(55);
        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        stack.push(59);
        System.out.println("Top element: " + stack.peek());
    }
}
