package HAckerRank.LinkList;

public class list {
    private Node head;
    private Node tail;
    private int size;

    public list(){
        this.size = 0;
    }

    // Creation of the node
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

    // Insertion in the list
    public void insertAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void insertAtLast(int value){
        Node node = new Node(value);
        if (tail == null){
            head = node;
            tail = head;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void insert(int value, int index){
        if (index == 0){
            insertAtFirst(value);
            return;
        }

        if (index == size){
            insertAtLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(value,temp.next);
        temp.next = newNode;
        size++;

    }

    // Deletion in the list
    public Node getPrevNode(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst(){

        if (size != 0){
            int removedValue = head.value;

            head = head.next;
            if (head == null){
                tail = null;
            }
            size--;
            return removedValue;
        }
        return 0;
    }

    public int deleteLast(){
        if (size <= 1){
            deleteFirst();
        }
        int removedValue = tail.value;
        Node prevTail = getPrevNode(size-2);
        tail = prevTail;
        tail.next = null;
        size--;
        return removedValue;
    }

    public int delete(int index){
        if (index == 0){
            return deleteFirst();
        }else if (index == size - 1){
            return deleteLast();
        }

        Node prevNode = getPrevNode(index-1);
        int val = prevNode.next.value;
        prevNode.next = prevNode.next.next;
        size--;
        return val;
    }

    // Display the list
    public void dispay(){
        Node temp = head;

        while (temp != null){
            System.out.print("| " + temp.value + " | -> ");
            temp = temp.next;
        }
        System.out.println("EOL");
    }
}
