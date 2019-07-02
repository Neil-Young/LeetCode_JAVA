public class mergeTwoLists {
    public static void main(String[] args){

    }

    public ListNode mergeTwoListsIntoOne(ListNode l1, ListNode l2){
        ListNode head = new ListNode(-1), p, p1, p2;
        for (p = head, p1 = l1, p2 = l2; p1 != null || p2 != null; p = p.next) {
            if (p1 != null) {
                if (p2 != null && p1.val > p2.val) {
                    p.next = p2;
                    p2 = p2.next;
                } else {
                    p.next = p1;
                    p1 = p1.next;
                }
            } else {
                p.next = p2;
                p2 = p2.next;
            }
        }
        return head.next;
    }
}
