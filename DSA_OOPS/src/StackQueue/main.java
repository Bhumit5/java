package StackQueue;

import StackQueue.Queue.cqueue;
import StackQueue.Queue.queue;

public class main {
    public static void main(String[] args) throws RangeExceptions {
        CStack stack = new CStack(6);

        stack.push(20);
        stack.push(10);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);


        stack.display();
        System.out.println("\nPopped items");
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("\nItems popped");
        stack.display();

//        System.out.println(stack);

        System.out.println();

        cqueue q  = new cqueue(5);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(50);
        q.enqueue(40);
        q.enqueue(60);

        q.display();
        q.dequeue();
        q.enqueue(10);
        q.display();

//        System.out.println(q.dequeue());
    }
}
