package Easy;

public class LeetCode101 {

    public static void main(String[] args) {
        TreeNode leftLeaf = new TreeNode(4);
        TreeNode rightLeaf = new TreeNode();
        TreeNode root = new TreeNode(2,leftLeaf,rightLeaf);

        System.out.println(isSymmetric(root));
    }

    public static boolean isSymmetric(TreeNode root) {
        return checkSubTree(root.left, root.right);
    }

    public static boolean checkSubTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if ((p == null && q != null) || (p != null && q == null) || (p.val != q.val)) {
            return false;
        }

        boolean left = checkSubTree(p.left, q.right);
        boolean root = p.val == q.val;
        boolean right = checkSubTree(p.right, q.left);

        return left && root && right;
    }
}
