package trees;

public class segment {

    private class Node{
        private int data;
        private int startIntereval;
        private int endIntereval;
        private Node left;
        private Node right;

        public Node(int start, int end){
            this.startIntereval = start;
            this.endIntereval = end;
        }
    }

    Node root;

    public segment(int[] values){
        this.root = constructTree(values, 0, values.length - 1);
    }

    private Node constructTree(int[] values, int start, int end){
        if (start == end){
            Node leaf = new Node(start, end);
            leaf.data = values[start];
            return leaf;
        }

        Node node = new Node(start, end);
        int mid = (start + end) / 2;

        node.left = constructTree(values,start,mid);
        node.right = constructTree(values,mid + 1,end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display(){
        display(this.root);
    }

    private void display(Node node){
        String str = "";

        if(node.left != null){
            str = str + "Left Interval = [ " + node.left.startIntereval + " - " + node.left.endIntereval + " ] and data : " + node.left.data + " ==> ";
        }else{
            str = str + "No left child ==> ";
        }

        str = str + "Interval = [ " + node.startIntereval + " - " + node.endIntereval + " ] and data :" + node.data + " <== ";

        if(node.right != null){
            str = str + "Right Interval = [ " + node.right.startIntereval + " - " + node.right.endIntereval + " ] and data : " + node.right.data;
        }else{
            str = str + "No right child";
        }

        System.out.println(str);

        if(node.left != null){
            display(node.left);
        }
        if(node.right != null){
            display(node.right);
        }
    }

    public int query(int qsi, int qei){
        return this.query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei){
        if(node.startIntereval >= qsi && node.endIntereval <= qei){
            return node.data;
        }else if(node.startIntereval > qei || node.endIntereval < qsi){
            return 0;
        }else{
            return query(node.left,qsi,qei) + query(node.right,qsi,qei);
        }
    }

    public void update(int index, int value){
        this.root.data = update(root,index,value);
    }

    private int update(Node node, int index, int value){
        if(index >= node.startIntereval && index <= node.endIntereval){
            if(index == node.startIntereval && index == node.endIntereval){
                node.data = value;
                return node.data;
            }else{
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);

                node.data = leftAns + rightAns;
                return node.data;
            }
        }

        return node.data;
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        segment tree = new segment(arr);
        tree.display();
        System.out.println(tree.query(1,6));
    }

}
