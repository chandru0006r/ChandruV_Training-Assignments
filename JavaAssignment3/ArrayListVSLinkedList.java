package JavaAssignment3;

import java.util.ArrayList;
import java.util.LinkedList;


public class ArrayListVSLinkedList {
    class SimpleArrayList {
        //  ArrayList uses a resizable array for fast random access (O(1)).
        public static void demonstrate() {
            ArrayList<String> list = new ArrayList<>();
            list.add("Apple");
            list.add("Banana");
            System.out.println("ArrayList (Get at index 1): " + list.get(1));
        }
    }

    class SimpleLinkedList {
        // LinkedList uses a doubly linked list structure for fast insertions/deletions at ends (O(1)).
        public static void demonstrate() {
            LinkedList<String> list = new LinkedList<>();
            list.add("Cat");
            list.addFirst("Dog");
            System.out.println("LinkedList (Get first element): " + list.getFirst());
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Demonstrating ArrayList ---");
        SimpleArrayList.demonstrate();
        
        System.out.println("\n--- Demonstrating LinkedList ---");
        SimpleLinkedList.demonstrate();
    }
}
