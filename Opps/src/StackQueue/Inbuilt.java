package StackQueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Inbuilt {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(12);
        stack.push(50);
        stack.push(28);
        stack.push(35);

        System.out.println("Stack : " + stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println("Stack : " + stack);


        Queue<Integer> queue = new LinkedList<>();
        queue.add(20);
        queue.add(10);
        queue.add(15);
        queue.add(25);
        System.out.println();
        System.out.println("Queue : " + queue);
        System.out.println(queue.remove());
        System.out.println("Queue : " + queue);

        Deque<Integer> deque = new LinkedList<>();
        deque.add(20);
        deque.addLast(15);
        deque.addFirst(40);
        System.out.println();
        System.out.println("Deque : "+ deque);
        System.out.println(deque.remove());
        System.out.println("Deque : "+ deque);
    }
}
