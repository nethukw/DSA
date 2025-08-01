/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nethu
 */
import java.util.LinkedList;
import java.util.Queue;

//Stack using two Queues
public class StackQueue {
    static class MyStack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        void push(int x) {
            q2.offer(x);
            while (!q1.isEmpty()) q2.offer(q1.poll());
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        int pop() {
            if (q1.isEmpty()) throw new RuntimeException("Stack is empty");
            return q1.poll();
        }
    }

    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(5);
        s.push(10);
        System.out.println("Popped: " + s.pop());
    }
}
