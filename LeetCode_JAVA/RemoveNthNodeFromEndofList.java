public class RemoveNthNodeFromEndofList {
    public static void main(String[] args){

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
