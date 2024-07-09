package tree_using_list;

import java.util.ArrayList;

public class BinarySearchTree {

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int value){

        if(root == null){
            root = new Node(value);
            return root;
        }

        if(root.data > value){
            root.left = insert(root.left, value);
        }

        if(root.data < value){
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public static boolean search(Node root, int value){
        if (root == null){
            return false;
        }

        if(root.data == value){
            return true;
        }

        if (root.data > value){
            return search(root.left, value);
        }
        return search(root.right, value);

    }

    public static Node inOrderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }

        return root;
    }

    public static Node delete(Node root, int val){

        if(root.data > val){
            root.left = delete(root.left,val);
        } else if(root.data < val){
            root.right = delete(root.right,val);
        }else{

            //* For leaf node
            if(isLeaf(root)){
                return null;
            }

            //* Node having one child only
            else if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            //* Node having more than one child
            else{
                Node IS = inOrderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right,IS.data);
            }
        }

        return root;
    }

    public static void printInRange(Node root, int start, int end){
        if (root == null){
            return;
        }

        if (root.data >= start && root.data <= end){
            printInRange(root.left,start,end);
            System.out.print(root.data + " ");
            printInRange(root.right,start,end);
        }else if(root.data <= end){
            printInRange(root.right,start,end);
        }else if(root.data >= start){
            printInRange(root.left,start,end);
        }
    }

    public static Boolean isLeaf(Node root){
        return root.left == null && root.right == null;
    }

    private static void printPath(ArrayList<Integer> path) {
        if(path.size() != 0){
            for(int num: path){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void printPaths(Node root, ArrayList<Integer> path){
        if (root == null){
            return;
        }

        path.add(root.data);

        if (isLeaf(root)){
            printPath(path);
        }else{
            printPaths(root.left, path);
            printPaths(root.right, path);
        }
        path.remove(path.size() - 1);
    }


    public static void main(String[] args) {

//*     Creating the Binary Search Tree
        int[] nodes = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
            root = insert(root, nodes[i]);
        }

//        inorder(root);

//*     Searching the element in tree_using_list
//        System.out.println(search(root,9));
        System.out.println();

//*       Deleting the nodes
//        delete(root,4);
//        delete(root,3);
//        inorder(root);

//*     Printing data in between the range
//        printInRange(root,4,7);

//*     Printing all possible paths
        printPaths(root,new ArrayList<Integer>());

    }

}
