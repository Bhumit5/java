package trees;
import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class lca {
    public static ArrayList<Integer> findPath(TreeNode root, int target) {
        return findPathRecursive(root, target);
    }

    private static ArrayList<Integer> findPathRecursive(TreeNode node, int target) {
        if (node == null)
            return new ArrayList<>();

        // If the current node is the target node, return a list containing only the target value
        if (node.val == target) {
            ArrayList<Integer> path = new ArrayList<>();
            path.add(node.val);
            return path;
        }

        // Recursively search in the left and right subtrees
        ArrayList<Integer> leftPath = findPathRecursive(node.left, target);
        if (!leftPath.isEmpty()) {
            leftPath.add(0, node.val); // Add current node to the path
            return leftPath;
        }

        ArrayList<Integer> rightPath = findPathRecursive(node.right, target);
        if (!rightPath.isEmpty()) {
            rightPath.add(0, node.val); // Add current node to the path
            return rightPath;
        }

        // If target is not found in the subtree rooted with 'node', return an empty list
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int target = 6;
        ArrayList<Integer> path = findPath(root, target);
        System.out.println("Path to node " + target + ": " + path);
    }
}
