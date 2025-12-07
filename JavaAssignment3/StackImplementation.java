package JavaAssignment3;

import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Initial Stack: " + stack);
        
        System.out.println("Element at the top (peek): " + stack.peek());
        
        int poppedElement = stack.pop();
        System.out.println("Element popped: " + poppedElement);
        System.out.println("Stack after pop operation: " + stack);
        
        System.out.println("Is the stack empty? " + stack.empty());
        
        System.out.println("Search for element 10 (offset from top): " + stack.search(10));
        
        stack.pop();
        stack.pop();
        
        System.out.println("Stack after clearing all elements: " + stack);
        System.out.println("Is the stack empty? " + stack.empty());
    }
}