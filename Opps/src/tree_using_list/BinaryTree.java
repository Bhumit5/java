package tree_using_list;
import java.util.*;

public class BinaryTree {

    static class Node{
        int data;
        Node left;
        Node right;
        static int count = 0;
        static int sum = 0;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
            this.count++;
            this.sum += data;
        }
    }

    static class BTree{
        static int idx = -1;


        public static Node createTree(int[] nodes){
            idx++;

            if(nodes[idx] == -1){
                return null;
            }

            // Preorder
            Node newNode = new Node(nodes[idx]);
            newNode.left = createTree(nodes);
            newNode.right = createTree(nodes);

            return newNode;
        }

        public static void preorder(Node node){
            if(node == null){
                return;
            }

            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }

        public static void inorder(Node node){
            if(node == null){
                return;
            }

            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }

        public static void postorder(Node node){
            if(node == null){
                return;
            }

            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }

        public static void levelOrder(Node node){

            if(node == null){
                System.out.println("No data in tree");
                return;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(node);
            queue.add(null);

            while(!queue.isEmpty()){
                Node curNode = queue.remove();
                if(curNode == null){
                    System.out.println();
                    if (queue.isEmpty()){
                        break;
                    }else{
                        queue.add(null);
                    }
                }else{
                    System.out.print(curNode.data + " ");
                    if(curNode.left != null){
                        queue.add(curNode.left);
                    }
                    if(curNode.right != null){
                        queue.add(curNode.right);
                    }
                }
            }
        }

        public static int kthLevelSum(Node node, int k){
            if(node == null){
                if(k > heightOfTree(node)){
                    System.out.println("kth level is not in the tree");
                }else{
                    System.out.println("No data in tree");
                }
                return -1;
            }

            ArrayList<Integer> ans = new ArrayList<>();

            Queue<Node> queue = new LinkedList<>();
            queue.add(node);
            queue.add(null);

            int total = 0;
            while(!queue.isEmpty()){
                Node curNode = queue.remove();
                if(curNode == null){
                    ans.add(total);
                    total = 0;

                    if (queue.isEmpty()){
                        break;
                    }else{
                        queue.add(null);
                    }
                }else{
                    total += curNode.data;
                    if(curNode.left != null){
                        queue.add(curNode.left);
                    }
                    if(curNode.right != null){
                        queue.add(curNode.right);
                    }
                }
            }

            return ans.get(k-1);
        }

        public static int countNode(Node node){

//            Method 1 : No overhead of creating extra nodes in each iteration
//            if(node == null){
//                return 0;
//            }
//
//            count++;
//            countNode(node.left);
//            countNode(node.right);
//
//            return count;


//          No need  maintain static variable
            if(node == null){
                return 0;
            }

            int leftNodes = countNode(node.left);
            int rightNodes = countNode(node.right);

            return leftNodes + rightNodes + 1;
        }

        public static int nodeTotal(Node node){

            if(node == null){
                return 0;
            }

            int leftSum = nodeTotal(node.left);
            int rightSum = nodeTotal(node.right);

            return leftSum + rightSum + node.data;
        }

        public static int heightOfTree(Node node){
            if(node == null)
                return 0;

            int leftHight = heightOfTree(node.left);
            int rightHight = heightOfTree(node.right);

            return Math.max(leftHight, rightHight) + 1;
        }

//      Time complexity is O(n^2)
        public static int diameterOfTree(Node node){
            if(node == null)
                return 0;

            int leftDiameter = diameterOfTree(node.left);
            int rightDiameter = diameterOfTree(node.right);
            int rootDiameter = heightOfTree(node.left) + heightOfTree(node.right) + 1;

            return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
        }

//      Time complexity is O(n)
        private static class treeInfo{
            int height;
            int diameter;

            treeInfo(int height,int diameter){
                this.height = height;
                this.diameter = diameter;
            }
        }

        public static treeInfo diameterOfTreeN(Node node){
            if(node == null)
                return new treeInfo(0,0);

            treeInfo leftTree = diameterOfTreeN(node.left);
            treeInfo rightTree = diameterOfTreeN(node.right);

            int treeHeight = Math.max(leftTree.height, rightTree.height) + 1;

            int leftDiameter = leftTree.diameter;
            int rightDiameter = rightTree.diameter;
            int rootDiameter = leftTree.height + rightTree.height + 1;

            int treeDiameter = Math.max(Math.max(leftDiameter, rightDiameter),rootDiameter);

            return new treeInfo(treeHeight, treeDiameter);
        }

        public static boolean isIdentical(Node root, Node subRoot){
            if (root == null && subRoot == null) {
                return true;
            }

            if (root == null || subRoot == null){
                return false;
            }

            if(root.data == subRoot.data){
                return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
            }

            return false;
        }

        public static boolean isSubtree(Node root, Node subRoot){
            if(subRoot == null){
                return true;
            }

            if(root == null){
                return false;
            }

            if(root.data == subRoot.data){
                if(isIdentical(root, subRoot)){
                    return true;
                }
            }
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,3,4,-1,-1,5,-1,-1,6,-1,-1,7,8,-1,9,-1,-1,-1};
//        int subtreeNodes[] = {3,4,-1,-1,5,-1,-1};


        BTree tree = new BTree();
        Node root = tree.createTree(nodes);

//        BTree subTree = new BTree();
//        Node subRoot = subTree.createTree(subtreeNodes);


        tree.preorder(root);

        System.out.println();
        tree.inorder(root);

        System.out.println();
        tree.postorder(root);

        System.out.println();
        tree.levelOrder(root);


        System.out.println("Total nodes in the tree is " + root.count);

        System.out.println("Total sum of the tree is " + root.sum);

        System.out.println("Total sum in the tree is " + tree.nodeTotal(root));

        System.out.println("Hight of the tree is " + tree.heightOfTree(root));

        System.out.println("Diameter of the tree is " + tree.diameterOfTree(root));

        System.out.println("Diameter of the tree is " + tree.diameterOfTreeN(root).height);

        System.out.println("Diameter of the tree is " + tree.diameterOfTreeN(root).diameter);

//        System.out.println(BTree.isSubtree(root,subRoot));

        int k = 3;

        System.out.println("Sum of the elements at level " +  k + " in tree is " + tree.kthLevelSum(root, k));

    }
}
