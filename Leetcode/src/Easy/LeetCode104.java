package Easy;

public class LeetCode104 {

    public static void main(String[] args) {
        TreeNode leftLeaf = new TreeNode(2);
        TreeNode rightLeaf = new TreeNode();
        TreeNode root = new TreeNode(2,leftLeaf,rightLeaf);

        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {
        int depth = 0;

        if(root != null){
            depth = findDepth(root, 1);
        }

        return depth;
    }

    public static int findDepth(TreeNode root, int depth){
        if(root == null){
            return 0;
        }

        int left = 1 + findDepth(root.left, depth + 1);
        int right = 1 + findDepth(root.right, depth + 1);

        return Math.max(left, right);
    }
}
