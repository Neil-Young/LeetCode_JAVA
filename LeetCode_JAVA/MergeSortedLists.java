public class MergeSortedLists {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(4);
        node1.next.next = new ListNode(5);
        node1.next.next.next = null;

        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(3);
        node2.next.next = new ListNode(4);
        node2.next.next.next = null;

        ListNode node3 = new ListNode(2);
        node3.next = new ListNode(6);
        node3.next.next = null;

        ListNode[] ln = new ListNode[3];
        ln[0] = node1;
        ln[1] = node2;
        ln[2] = node3;

        mergeKLists(ln);
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        int len=lists.length;

        if(lists==null||len==0)
            return null;
        if(len==1)
            return lists[0];

        while(len>1)
        {
            int mid=(len+1)/2;
            for(int i=0;i<len/2;i++)
            {
                lists[i]=merge2Lists(lists[i],lists[i+mid]);
            }
            len=mid;
        }
        return lists[0];
    }

    public static ListNode merge2Lists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode ln = new ListNode(-1), cur = ln;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = l2;
                l2 = l2.next;
            }
        }
        if (l1 != null) cur.next = l1;
        if (l2 != null) cur.next = l2;
        return ln.next;
    }
}
