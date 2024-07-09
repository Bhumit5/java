package trees;

public class BST {
    final public class Node{
        private final int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;
    public BST(){}

    public int height(Node node) {
        if(node == null)
            return -1;

        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value){
        root = this.insert(this.root,value);
    }

    public Node insert(Node node, int value) {
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value >= node.value){
            node.right = insert(node.right,value);
        }

        if(value < node.value){
            node.left = insert(node.left,value);
        }

        node.height = Math.max(height(node.left),height(node.right)) + 1;

        return node;
    }

    public void insert(int[] value){
        for (int i = 0; i < value.length; i++) {
            this.insert(value[i]);
        }
    }

    public void insertSorted(int[] value){
        insertSorted(value,0,value.length);
    }

    private void insertSorted(int[] value,int start,int end){
        if(start >= end){
            return;
        }

        int mid = (start + end) / 2;
        this.insert(value[mid]);
        insertSorted(value,start,mid);
        insertSorted(value,mid+1,end);
    }

    public void display(){
        this.display(this.root,"Root Node : ");
    }

    public boolean isBalanced(){
        return this.isBalanced(root);
    }

    private boolean isBalanced(Node node){
        if(node == null){
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    private void display(Node node, String info){
        if (node == null){
            return;
        }

        display(node.left, "Left of " + node.value + " is : " );
        System.out.println(info + node.value + " and height is : " + node.height);
        display(node.right, "Right of " + node.value + " is : " );
    }

    public void preorder(){
        this.preorder(root);
    }

    private void preorder(Node node){
        if(node == null){
            return;
        }

        System.out.println(node.value);
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder(){
        this.inorder(root);
    }

    private void inorder(Node node){
        if(node == null){
            return;
        }

        inorder(node.left);
        System.out.println(node.value);
        inorder(node.right);
    }

    public void postorder(){
        this.postorder(root);
    }

    private void postorder(Node node){
        if(node == null){
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.println(node.value);
    }

    public static void main(String[] args) {
        BST tree = new BST();
        int[] elements = new int[]{8,3,5,2,1,9,15};
        int[] values = new int[]{1,2,3,4,5};
        tree.insertSorted(values);
        tree.display();

        System.out.println(tree.isBalanced());
        tree.inorder();
        System.out.println();
        tree.preorder();
        System.out.println();
        tree.postorder();
    }
}
