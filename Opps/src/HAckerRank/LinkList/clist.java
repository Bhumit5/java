package HAckerRank.LinkList;

public class clist {
    private Node head;
    private Node tail;
    private int size;

    public clist() {
        this.size = 0;
    }


    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public void insertLast(int value){
        Node node = new Node(value);

        if (head == null){
            head = node;
            tail = node;
            size++;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;

        size++;
    }

    public void delete(int value){
        Node node = head;

        if (node == null){
            System.out.println("List is already empty!");
            return;
        }

        if (node.value == value){
            head = head.next;
            tail.next = head;
            size--;
            return;
        }

        do{
            Node nextNode = node.next;
            if (nextNode.value == value){
                node.next = nextNode.next;
                break;
            }
            node = node.next;
        }while (node == head);

        size--;
    }

    public int length(){
        return size;
    }

    public void display(){
        Node node = head;

        if (node != null){
            do {
                System.out.print("| " + node.value + " | -> ");
                node = node.next;
            }while (node != head);
        }
        System.out.println("HEAD");
    }
}
