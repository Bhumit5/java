package StackQueue;

public class CStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public CStack(){
        this(DEFAULT_SIZE);
    }

    public CStack(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return ptr == data.length - 1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }

    public boolean push(int value){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        data[++ptr] = value;
        return true;
    }

    public int pop() throws RangeExceptions {
        if (isEmpty()){
            throw new RangeExceptions("Cannot pop from an empty stack!!");
        }
        int value = data[ptr--];
        return value;
    }

    public int peek() throws RangeExceptions {
        if (isEmpty()){
            throw new RangeExceptions("Cannot peek from an empty stack!!");
        }
        return data[ptr];
    }

    public void display(){
        if (ptr == -1) {
            System.out.println("Stack is empty!");
            return;
        }

        int size = ptr;

        while (size != -1){
            System.out.println("| "+ this.data[size] +" |");
            if (size == 0){
                System.out.println("|____|");
            }
            size--;
        }
    }
}
