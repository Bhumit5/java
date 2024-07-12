package Easy;

public class LeetCode83 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3};
        ListNode list = insert(arr);
        display(deleteDuplicates(list));
    }

    static ListNode insert(int[] arr) {
        ListNode head = new ListNode();
        ListNode node = head;

        for (int num : arr) {
            ListNode temp = new ListNode(num);
            node.next = temp;
            node = node.next;
        }

        return head.next;
    }

    static void display(ListNode list){
        while(list != null){
            System.out.print(list.val+" ");
            list = list.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode prev = head;
        ListNode nextNode = prev.next;

        while (nextNode != null) {

            if (prev.val == nextNode.val) {
                nextNode = nextNode.next;
                prev.next = nextNode;
            } else {
                nextNode = nextNode.next;
                prev = prev.next;
            }
        }
        return head;
    }
}
