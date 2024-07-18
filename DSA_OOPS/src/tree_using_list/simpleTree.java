package tree_using_list;

import java.util.*;

public class simpleTree {

    public simpleTree(int value){
    }

    private class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner sc){
        System.out.println("Enter root Node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc,root);
    }

    private void populate(Scanner sc, Node node){
        System.out.println("Do you want to enter left of: " + node.value);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the value of left node of " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc,node.left);
        }

        System.out.println("Do you want to enter right of: " + node.value);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the value of right node of " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc,node.right);
        }
        
    }
}





//public class Solution {
//    private static final long MOD = (long)1e9+7;
//    public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {
//        // Write your code here!
//        long[] presum = new long[n+1];
//        for (int i = 0; i < n; i++) {
//            presum[i+1] = (presum[i] % MOD + arr[i] % MOD) % MOD;
//        }
//
//        List<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < queries.size(); i++) {
//            long start = queries.get(i).get(0);
//            long end = queries.get(i).get(1);
//
//            long endSum = sumFromStart(presum, n, end);
//            long startSum = sumFromStart(presum, n, start-1);
//            /**
//             Note:
//             This has to be some test case glitch where they are using negative values.
//             Althouh according to constrains array can not have negative values.
//             Report this along with me.
//             ans.add((int)((endSum-startSum+((((MOD)))))%MOD));
//             The MOD is so many round braces is necessary only when result is going to
//             be negative. Which shouldnt be the case in this problem. Its a test case error according to me.
//             **/
//            ans.add((int)((endSum-startSum+MOD)%MOD));
//        }
//
//        return ans;
//    }
//
//    private static long sumFromStart(long[] presum, int n, long index) {
//        long complete = index/n;
//        long incomplete = (int)(index%n);
//
//        /**
//         Note:
//         if you write the below line as
//         long ans = (presum[n] % MOD * complete % MOD) % MOD;
//         instead of
//         long ans = ((presum[n] % MOD) * (complete % MOD)) % MOD;
//         then presum[n] % MOD is evaluated first and then it evaluates its result with * complete.
//         This interpretation of above equation is wrong.
//         Therefore put braces for each mod operations.
//         **/
//        long ans = ((presum[n] % MOD) * (complete % MOD)) % MOD;
//        ans = (ans % MOD + presum[(int)(incomplete%MOD)] % MOD) % MOD;
//        return ans;
//    }
//}
