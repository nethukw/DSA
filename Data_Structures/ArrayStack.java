/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nethu
 */
public class ArrayStack {
    static class Stack {
        int[] arr;
        int top;

        Stack(int size) {
            arr = new int[size];
            top = -1;
        }

        void push(int x) {
            if (top == arr.length - 1) throw new RuntimeException("Stack Overflow");
            arr[++top] = x;
        }

        int pop() {
            if (top == -1) throw new RuntimeException("Stack Underflow");
            return arr[top--];
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        System.out.println("Popped: " + s.pop());
    }
}

