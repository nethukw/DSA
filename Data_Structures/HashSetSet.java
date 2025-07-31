
import java.util.HashSet;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nethu
 */
public class HashSetSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a HashSet of integers
        Set<Integer> studentIDs = new HashSet<>();

        // Add elements
        studentIDs.add(101);
        studentIDs.add(102);
        studentIDs.add(103);
        studentIDs.add(104);

        // Duplicate values will be ignored
        studentIDs.add(102);

        System.out.println("Student IDs: " + studentIDs);

        // Check existence
        System.out.println("Contains 103? " + studentIDs.contains(103));

        // Remove an element
        studentIDs.remove(104);
        System.out.println("After removing 104: " + studentIDs);

        // Set size
        System.out.println("Total unique students: " + studentIDs.size());

        // Iterate through set
        System.out.println("All student IDs:");
        for (int id : studentIDs) {
            System.out.println("- " + id);
        }

        // Clear the set
        studentIDs.clear();
        System.out.println("After clearing: " + studentIDs);
    
    }
    
}
