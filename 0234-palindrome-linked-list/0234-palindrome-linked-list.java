class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head; ListNode fast=head; ListNode temp=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        } //now slow is MIDPOINT
        ListNode newhead=slow;

        ListNode curr=newhead; ListNode next=null; ListNode prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }newhead=prev;

        while(newhead!=null){
            if(temp.val!=newhead.val){return false;}
            temp=temp.next;
            newhead=newhead.next;
        }                    
        return true;
    }
}