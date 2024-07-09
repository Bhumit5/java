package HAckerRank.LinkList;

public class dlist {
    Node head;
//    Node tail;
    int size;

    private class Node{
        Node prev;
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(Node next,int value,Node prev){
            this.next = next;
            this.prev = prev;
            this.value = value;
        }
    }

    dlist(){this.size = 0;}

    public void insertAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head!=null){
            head.prev = node;
        }
        head = node;
        size++;
    }

    public Node getTail(){
        Node node = head;
        while(node.next != null){
            node = node.next;
        }
        return node;
    }

    public void insertAtLast(int value){
        if (head == null){
            insertAtFirst(value);
            return;
        }

        Node node = new Node(value);
        Node tail = getTail();
        tail.next = node;
        node.prev = tail;
        node.next = null;
        size++;
    }

    // Display the list
    public void dispay(){
        Node temp = head;

        System.out.print("START <=> ");
        while (temp != null){
            System.out.print("| " + temp.value + " | <=> ");
            temp = temp.next;
        }
        System.out.println("EOL");
    }

    public Node getPrevNode(int index){
        Node node = head;
        for (int i = 0; i < index-1; i++) {
            node = node.next;
        }
        return node;
    }

    public void insert(int value, int index){
        if (index == 0){
            insertAtFirst(value);
            return;
        }

        if (index == size-1){
            insertAtLast(value);
            return;
        }

        if (index > size-1){
            System.out.println("Node doesn't exists");
            return;
        }

        Node previous = getPrevNode(index);
        System.out.println(previous.value);
        Node node = new Node(value);

        node.next = previous.next;
        previous.next.prev = node;
        node.prev = previous;
        previous.next = node;

        size++;
    }

    // Display the list
    public void dispayReverse() {
        System.out.print("END <=> ");
        dispayReverse(this.head);
        System.out.println(" <=> START");
    }

    // Display the list
    public void dispayReverse(Node head){
        Node temp = head;
        if (temp != null){
            dispayReverse(temp.next);
            System.out.print("| " + temp.value + " |");
            if (temp != this.head){
                System.out.print(" <=> ");
            }
        }
        return;
    }
}
