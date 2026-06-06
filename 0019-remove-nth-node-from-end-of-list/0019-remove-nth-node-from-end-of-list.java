class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        head=dummy;
        ListNode fast=dummy; ListNode slow=dummy; 

        int i=0;
        while(i<n){
            fast=fast.next; //CREATING GAP OF n
            i++;
        }
        if(fast==null){return null;}
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;

        return dummy.next; //AS 0 IS AT THE HEAD OF THE LIST
    }
}