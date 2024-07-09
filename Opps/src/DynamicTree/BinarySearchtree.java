package DynamicTree;

public class BinarySearchtree {

    private static class Node{
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

    public int height(Node root){
        if (root == null){
            return -1;
        }
        return root.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert(root, value);
    }

    private Node insert(Node root, int value){
        if(root == null){
            Node newRoot = new Node(value);
            return newRoot;
        }

        if (value < root.getValue()){
            root.left = insert(root.left, value);
        }

        if (value < root.getValue()){
            root.right = insert(root.left, value);
        }

        root.height = Math.max(height(root.left), height(root.right)) + 1;

        return root;
    }

    public void display(){
        display(root,"Root node : ");
    }

    private void display(Node root, String detail){
        if (root == null){
            return;
        }

        System.out.println(detail + root.getValue());
        display(root.left, "Left child of " + root.getValue() + " : ");
        display(root.right, "Right child of " + root.getValue() + " : ");
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node root) {
        if (root == null) {
            return true;
        }
        return Math.abs(height(root.left) - height(root.right)) <= 1 && balanced(root.left) && balanced(root.left);
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

    }
}