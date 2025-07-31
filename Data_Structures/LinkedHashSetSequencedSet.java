
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nethu
 */
public class LinkedHashSetSequencedSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Create a LinkedHashSet of strings
        Set<String> countries = new LinkedHashSet<>();

        // Add elements in specific order
        countries.add("Sri Lanka");
        countries.add("Japan");
        countries.add("Germany");
        countries.add("India");
        countries.add("Japan");  // Duplicate, will be ignored

        // Display the set
        System.out.println("Countries in insertion order:");
        for (String country : countries) {
            System.out.println("- " + country);
        }

        // Check presence
        System.out.println("Contains India? " + countries.contains("India"));

        // Remove an item
        countries.remove("Germany");
        System.out.println("After removing Germany: " + countries);

        // Size of set
        System.out.println("Number of countries: " + countries.size());

        // Clear all
        countries.clear();
        System.out.println("After clearing: " + countries);
    
    }
    
}
