package Easy;

public class LeetCode100 {
    public static void main(String[] args) {
        TreeNode leaf = new TreeNode(3);
        TreeNode leaf12 = new TreeNode(4);
        TreeNode rig = new TreeNode(2,leaf,leaf12);
        TreeNode root = new TreeNode(1,null,rig);

        TreeNode leaf2 = new TreeNode(3);
        TreeNode leaf22 = new TreeNode(4);
        TreeNode rig2 = new TreeNode(2,leaf2,leaf22);
        TreeNode root2 = new TreeNode(2,null,rig2);

        System.out.println(isSameTree(root, root2));



    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if ((p == null && q != null) || (p != null && q == null) || (p.val != q.val)) {
            return false;
        }

        boolean left = isSameTree(p.left, q.left);
        boolean root = p.val == q.val;
        boolean right = isSameTree(p.right, q.right);

        return left && root && right;
    }
}
