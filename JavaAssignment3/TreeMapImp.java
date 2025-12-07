package JavaAssignment3;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapImp {
    public static void main(String[] args) {
        TreeMap<Integer, String> studentScores = new TreeMap<>();
        studentScores.put(101, "Alice");
        studentScores.put(103, "Charlie");
        studentScores.put(102, "Bob");
        studentScores.put(100, "David");
        
        System.out.println("TreeMap in Ascending Order of Keys:");
        for (Map.Entry<Integer, String> entry : studentScores.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        Map<Integer, String> descendingMap = studentScores.descendingMap();
        
        System.out.println("\nTreeMap in Descending Order of Keys:");
        for (Map.Entry<Integer, String> entry : descendingMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}