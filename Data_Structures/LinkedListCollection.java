/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinkedListCollection;

import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author nethu
 */
public class LinkedListCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a LinkedList as a Collection
        Collection<String> fruits = new LinkedList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Pineapple");

        System.out.println("Fruits collection: " + fruits);

        // Remove an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Check if element exists
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // Size of the collection
        System.out.println("Total fruits: " + fruits.size());

        // Iterate through the collection
        System.out.println("Iterating through fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // Clear the collection
        fruits.clear();
        System.out.println("After clearing: " + fruits);
    
    }
    
}
