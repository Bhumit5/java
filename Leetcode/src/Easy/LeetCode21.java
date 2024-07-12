package Easy;



public class LeetCode21 {

    public static void main(String[] args) {
        int[] l1 = {1,2,4};
        int[] l2 = {1,3,4};

        ListNode list1 = insert(l1);
        ListNode list2 = insert(l2);

        ListNode res1 = mergeTwoListsRec(list1,list2);
//        ListNode res2 = mergeTwoLists(list1,list2);

        System.out.print("res1 : ");
        display(res1);
//        System.out.println();
//        System.out.print("res2 : ");
//        display(res2);

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

    public static ListNode mergeTwoListsRec(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoListsRec(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoListsRec(list1, list2.next);
                return list2;
            }
        }
        if (list1 == null) {
            return list2;
        }
        return list1;
    }

//    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if (list1 == null) {
//            return list2;
//        }
//
//        if (list2 == null) {
//            return list1;
//        }
//
//        ListNode res = new ListNode(0);
//        ListNode result = res;
//
//        while (list1 != null && list2 != null) {
//            if (list1.val > list2.val) {
//                ListNode temp = new ListNode(list2.val);
//                result.next = temp;
//                list2 = list2.next;
//            } else {
//                ListNode temp = new ListNode(list1.val);
//                result.next = temp;
//                list1 = list1.next;
//            }
//            result = result.next;
//        }
//
//        while (list1 != null) {
//            ListNode temp = new ListNode(list1.val);
//            result.next = temp;
//            result = result.next;
//            list1 = list1.next;
//        }
//
//        while (list2 != null) {
//            ListNode temp = new ListNode(list2.val);
//            result.next = temp;
//            result = result.next;
//            list2 = list2.next;
//        }
//
//        return res.next;
//    }
}
