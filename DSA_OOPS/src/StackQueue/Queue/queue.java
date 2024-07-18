package StackQueue.Queue;

import StackQueue.RangeExceptions;

public class queue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end = -1;

    public queue() {
        this(DEFAULT_SIZE);
    }

    public queue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return end == data.length - 1;
    }

    public boolean isEmpty(){
        return end == -1;
    }

    public boolean enqueue(int value) throws RangeExceptions{
        if(isFull()){
            throw new RangeExceptions("Cannot enqueue element in empty queue");
        }

        data[++end] = value;
        return true;
    }

    public int dequeue() throws RangeExceptions{
        if(isEmpty()){
            throw new RangeExceptions("Cannot dequeue element from empty queue");
        }

        int value = data[0];

        // Shifting all elements
        for (int i = 0; i < data.length - 1; i++) {
            data[i] = data[i+1];
        }
        end--;
        return value;
    }

    public void display(){
        for (int i = 0; i <= end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }
}
