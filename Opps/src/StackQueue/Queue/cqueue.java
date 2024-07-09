package StackQueue.Queue;

import StackQueue.RangeExceptions;

public class cqueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int front = 0;
    protected int end = 0;
    protected int size = 0;

    public cqueue() {
        this(DEFAULT_SIZE);
    }

    public cqueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean enqueue(int value) throws RangeExceptions {
        if(isFull()){
            throw new RangeExceptions("Cannot enqueue element in empty queue");
        }

        data[end++] = value;
        end %= data.length;
        size++;

        return true;
    }

    public int dequeue() throws RangeExceptions{
        if(isEmpty()){
            throw new RangeExceptions("Cannot dequeue element from empty queue");
        }

        int value = data[front++];
        front %= data.length;
        size--;
        return value;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }

        int i = front;
        do{
            System.out.print(data[i++] + " <- ");
            i %= data.length;
        }while(i != end);
        System.out.println("END");
    }
}
