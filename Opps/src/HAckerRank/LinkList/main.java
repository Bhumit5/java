package HAckerRank.LinkList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class main {

      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }

          static void display(ListNode l){
              while(l != null){
                  System.out.println(l.val);
                  l = l.next;
              }
          }
      }

    public static int getInteger(ListNode l){
        if(l.next == null){
            return l.val;
        }
        return getInteger(l.next)*10 + l.val;
    }

    public static void main(String[] args) {
  /*      ListNode num1 = new ListNode(9,null);

        ListNode num4 = new ListNode(9,null);
        ListNode num13 = new ListNode(9,num4);
        ListNode num12 = new ListNode(9,num13);
        ListNode num11 = new ListNode(9,num12);
        ListNode num10 = new ListNode(9,num11);
        ListNode num9 = new ListNode(9,num10);
        ListNode num8 = new ListNode(9,num9);
        ListNode num7 = new ListNode(9,num8);
        ListNode num5 = new ListNode(9,num7);
        ListNode num6 = new ListNode(1,num5);


        System.out.println(getInteger(num1));
        System.out.println(getInteger(num6));
        int total = getInteger(num1) + getInteger(num6);
        int reminder = total % 10;
        ListNode ans = new ListNode(reminder,null);
        total /= 10;

        ListNode prev = ans;
        while(total != 0){
        reminder = total % 10;
        ListNode ans2 = new ListNode(reminder,null);
        prev.next = ans2;
        prev = ans2;
        total /= 10;
        }

        ListNode.display(ans);
*/

        String[] lines = new String[]{"fa","flask","flow","flower","flowerpot"};
        Arrays.sort(lines);
        for (String s: lines){
            System.out.println(s);
        }

        System.out.println("0".repeat(10));

        }

//        Single link list
//        list ll = new list();
//
//        ll.insertAtFirst(5);
//        ll.insertAtFirst(8);
//        ll.insertAtLast(8);
//        ll.insertAtLast(10);
//        ll.insert(50,2);
//       System.out.println(ll.deleteFirst());
//        ll.dispay();
//        System.out.println(ll.deleteLast());
//
//        ll.dispay();


//        Doubly link list
//        dlist list = new dlist();
//
//        list.insertAtFirst(5);
//        list.insertAtFirst(4);
//        list.insertAtFirst(3);
//        list.insertAtLast(12);
//        list.insertAtLast(52);
//        list.insert(20,4);
//        list.dispay();
//        list.dispayReverse();

//        clist list = new clist();
//        list.insertLast(20);
//        list.insertLast(2);
//        list.insertLast(28);
//        list.insertLast(58);
//        list.insertLast(27);
//        list.display();
//        list.delete(20);
//        System.out.println(list.length());
//        list.display();

    }

