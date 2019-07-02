import java.util.List;

public class RemoveNthNodeFromEndofList {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(2);
        head.next = head2;
        ListNode head3 = new ListNode(3);
        head.next.next = head3;
        ListNode head4 = new ListNode(4);
        head.next.next.next = head4;
        ListNode head5 = new ListNode(5);
        head.next.next.next.next = head5;
        head.next.next.next.next.next = null;
        removeNthFromEnd(head,2);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start;
        ListNode fast = start;
        slow.next = head;

        // Move fast in front so that the gap between slow and fast becomes n
        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }
        // Move fast to the end, maintaining the gap
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // Skip the desired node
        slow.next = slow.next.next;
        System.out.println(start.next);
        return start.next;
    }
}
