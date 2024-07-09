package StackAndQueue;

public class main{
    public static void main(String[] args) throws Exception {
        QueueUsingStack st = new QueueUsingStack();
        st.add(12);
        st.add(25);
        st.add(20);
        st.add(10);

        System.out.println(st.remove());
        System.out.println(st.remove());
        System.out.println(st.remove());
        System.out.println(st.remove());
    }
}
