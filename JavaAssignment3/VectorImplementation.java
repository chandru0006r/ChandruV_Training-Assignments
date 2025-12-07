package JavaAssignment3;

import java.util.Vector;
import java.util.Enumeration;

public class VectorImplementation {
    public static void main(String[] args) {
        Vector<String> programmingLanguages = new Vector<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C++");
        programmingLanguages.add("JavaScript");
        
        System.out.println("Initial Vector: " + programmingLanguages);
        
        System.out.println("Element at index 1: " + programmingLanguages.get(1));
        
        programmingLanguages.set(1, "Go");
        System.out.println("Vector after updating element at index 1: " + programmingLanguages);
        
        programmingLanguages.remove(3);
        System.out.println("Vector after removing element at index 3: " + programmingLanguages);
        
        System.out.println("Size of Vector: " + programmingLanguages.size());
        System.out.println("Capacity of Vector: " + programmingLanguages.capacity());
        
        Enumeration<String> en = programmingLanguages.elements();
        System.out.print("Elements via Enumeration: ");
        while(en.hasMoreElements()){
            System.out.print(en.nextElement() + " ");
        }
        System.out.println();
    }
}