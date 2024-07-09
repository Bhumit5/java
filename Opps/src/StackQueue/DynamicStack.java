package StackQueue;

public class DynamicStack extends CStack{
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int value) {
        if (this.isFull()){
            int[] temp = new int[data.length * 2];

            // Simple way
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            // Advanced way
            System.arraycopy(data,0,temp,0,data.length);

            data = temp;
        }

        return super.push(value);

    }
}

