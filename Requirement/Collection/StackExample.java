import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Declare a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushes: " + stack); // Output: [10, 20, 30]

        // Pop an element from the stack
        int topElement = stack.pop();
        System.out.println("Popped element: " + topElement); // Output: 30
        System.out.println("Stack after pop: " + stack); // Output: [10, 20]

        // Peek at the top element without removing it
        int topElementPeek = stack.peek();
        System.out.println("Top element using peek: " + topElementPeek); // Output: 20
        System.out.println("Stack after peek: " + stack); // Output: [10, 20]

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty); // Output: false

        // Get the size of the stack
        int size = stack.size();
        System.out.println("Size of the stack: " + size); // Output: 2
    }
}
