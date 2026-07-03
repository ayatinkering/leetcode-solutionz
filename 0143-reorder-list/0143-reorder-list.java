class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // find middle
        ListNode s = head; ListNode f = head;
        while (f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
        }

        // reverse second half
        ListNode prev = null;
        ListNode curr = s.next; //CURRENT Is first node in second half
        s.next = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // merge
        ListNode first = head; ListNode second = prev;

        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}