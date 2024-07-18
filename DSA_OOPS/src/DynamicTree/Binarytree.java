package DynamicTree;
import java.util.*;

public class Binarytree {

    public Binarytree(){}

    private static class Node{
        int data;
        Node left;
        Node right;
        static int size = 0;

        public Node(int data) {
            this.data = data;
            size++;
        }
    }

    private static Node root;

    public static void populate(Scanner sc){
        System.out.print("Enter the root node : ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    public static void display(){
        display(root,"");
    }

    public static void display(Node root, String indent){
        if(root == null){
            return;
        }

        System.out.println(indent + "> " + root.data);
        display(root.left, indent + "--");
        display(root.right, indent + "--");
    }

    public static void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    public static void prettyDisplay(Node root, int indent){
        if (root == null){
            return;
        }

        prettyDisplay(root.right, indent + 1);

        if (indent != 0){
            for (int i = 0; i < indent-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + root.data);
        }else{
            System.out.println(root.data);
        }
        prettyDisplay(root.left, indent + 1);
    }

    public static void populate(Scanner sc, Node root){
        System.out.print("Do you want to enter the left of " + root.data + " ? : ");
        Boolean left = sc.nextBoolean();
        if(left){
            System.out.print("Enter the value of the left of " + root.data + " : ");
            int value = sc.nextInt();
            root.left = new Node(value);
            populate(sc, root.left);
        }

        System.out.print("Do you want to enter the right of " + root.data + " ? : ");
        Boolean right = sc.nextBoolean();
        if(right){
            System.out.print("Enter the value of the right of " + root.data + " : ");
            int value = sc.nextInt();
            root.right = new Node(value);
            populate(sc, root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Binarytree tree = new Binarytree();
        populate(sc);
        display();
        prettyDisplay();
    }
}
