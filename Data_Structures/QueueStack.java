
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nethu
 */

//Queue implemented using two Stacks
public class QueueStack {
static class MyQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        void enqueue(int x) {
            while (!s1.isEmpty()) s2.push(s1.pop());
            s1.push(x);
            while (!s2.isEmpty()) s1.push(s2.pop());
        }

        int dequeue() {
            if (s1.isEmpty()) throw new RuntimeException("Queue is empty");
            return s1.pop();
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Dequeued: " + q.dequeue());
    }

}
