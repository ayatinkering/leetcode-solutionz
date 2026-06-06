public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head; ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next; //move 1 step
            fast=fast.next.next; //moce 2 steps

            if(fast==slow)
                return true;
        }
        return false;
    }
}