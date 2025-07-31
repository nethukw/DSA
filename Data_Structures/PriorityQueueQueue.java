
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nethu
 */
public class PriorityQueueQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Create a PriorityQueue of integers (min-heap by default)
        Queue<Integer> taskQueue = new PriorityQueue<>();

        // Add elements (random order)
        taskQueue.add(30);
        taskQueue.add(10);
        taskQueue.add(20);
        taskQueue.add(40);

        System.out.println("Task Queue (natural priority): " + taskQueue);

        // Peek (view highest-priority element)
        System.out.println("Top priority task: " + taskQueue.peek());

        // Process elements in priority order
        System.out.println("Processing tasks in priority order:");
        while (!taskQueue.isEmpty()) {
            System.out.println("- Processing task: " + taskQueue.poll());
        }

        // Queue is now empty
        System.out.println("Task Queue after processing: " + taskQueue);
    
    }
    
}
