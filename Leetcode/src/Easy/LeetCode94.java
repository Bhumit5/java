package Easy;
import com.sun.source.tree.Tree;

import java.util.List;
import java.util.ArrayList;

public class LeetCode94 {
    public static void main(String[] args) {
        TreeNode leaf = new TreeNode(3);
        TreeNode leaf2 = new TreeNode(4);
        TreeNode rig = new TreeNode(2,leaf,leaf2);
        TreeNode root = new TreeNode(1,null,rig);

        List<Integer> ans = inorderTraversal(root);
        for(int n : ans){
            System.out.print(n + " ");
        }

    }

    public static List<Integer> inorderTraversal(TreeNode root) {

        if(root == null){
            List<Integer> temp = new ArrayList<>();
            return temp;
        }

        List<Integer> res = new ArrayList<>();
        List<Integer> left = inorderTraversal(root.left);
        res.addAll(left);
        res.add(root.val);
        List<Integer> right = inorderTraversal(root.right);
        res.addAll(right);

        return res;
    }
}
