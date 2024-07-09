package DynamicTree;

public class AVLTree {

    public class Node{
        private int value;
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

    public AVLTree(){}

    public int height(){
        return height(root);
    }

    private int height(Node node){
        if (node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert(root, value);
    }

    private Node insert(Node node, int value){
        if(node == null){
            Node newNode = new Node(value);
            return newNode;
        }

        if (value < node.value){
            node.left = insert(node.left, value);
        }

        if (value > node.value){
            node.right = insert(node.right, value);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }

    private int bFactor(Node node){
        return height(node.left) - height(node.right);
    }

    private Node rotate(Node node) {
        //* Left side heavy
        if(bFactor(node) > 1){

            //* left-left
            if(bFactor(node.left) > 0){
                return rightRotate(node);
            }

            //* left-right
            if(bFactor(node.left) < 0){
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        //* right side heavy
        if(bFactor(node) < -1){

            //* right-right
            if(bFactor(node.right) < 0){
                return leftRotate(node);
            }

            //* right-left
            if(bFactor(node.right) > 0){
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    public Node rightRotate(Node node){
        Node child = node.left;
        Node grandChild = child.right;

        child.right = node;
        node.left = grandChild;

        node.height = Math.max(height(node.left),height(node.right) + 1);
        child.height = Math.max(height(child.left),height(child.right) + 1);

        return child;
    }

    public Node leftRotate(Node node){
        Node child = node.right;
        Node grandChild = child.left;

        child.left = node;
        node.right = grandChild;

        child.height = Math.max(height(child.left),height(child.right) + 1);
        node.height = Math.max(height(node.left),height(node.right) + 1);

        return child;
    }

    public void display(){
        display(root,"Root node : ");
    }

    private void display(Node node, String detail){
        if (node == null){
            return;
        }

        System.out.println(detail + node.getValue());
        display(node.left, "Left child of " + node.getValue() + " : ");
        display(node.right, "Right child of " + node.getValue() + " : ");
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(bFactor(node)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }

    public void populateSorted(int[] nums, int start, int end){
        if(start >= end){
            return;
        }

        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
    }

    public static void main(String[] args) {

        AVLTree tree = new AVLTree();

        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }

        System.out.println("Height : " + tree.height());
    }
}
