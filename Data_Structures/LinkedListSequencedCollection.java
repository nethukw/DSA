
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nethu
 */
public class LinkedListSequencedCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create LinkedList
        LinkedList<String> tasks = new LinkedList<>();

        // Add elements at the end
        tasks.add("Wake up");
        tasks.add("Brush teeth");

        // Add elements at the beginning and end (sequential)
        tasks.addFirst("Open eyes");
        tasks.addLast("Eat breakfast");

        System.out.println("Task List: " + tasks);

        // Access first and last elements
        System.out.println("First task: " + tasks.getFirst());
        System.out.println("Last task: " + tasks.getLast());

        // Remove elements from start and end
        tasks.removeFirst();
        tasks.removeLast();

        System.out.println("After removing first & last tasks: " + tasks);

        // Insert at specific index
        tasks.add(1, "Take shower");
        System.out.println("After inserting at index 1: " + tasks);

        // Iterate
        System.out.println("Task Schedule:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    
    }
    
}
