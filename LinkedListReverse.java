import java.util.*;

public class LinkedListReverse {
    public ListNode reverseList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode lst = (ListNode) head.next;
        head.next = null;
        while(lst!=null){
            ListNode t = (ListNode) lst.next;
            lst.next = head;
            head = lst;
            lst = t;
        }
        return head;

    }
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println(reverseList(list));
        //collection Framework way to reverse the linked list
        // Collections.reverse(list);
        // System.out.println(list);
    }
}
