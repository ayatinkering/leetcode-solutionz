public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;ListNode slow=head; ListNode ans=null;
        int found=0; int pos=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next; 
            fast=fast.next.next;
            if(fast==slow){//CYCLE FOUND
                found=1;
                break;
            }
        }
        if(found==0){
            pos=-1; 
            return null;
        }

        slow=head; //KEEP FAST WHERE IT IS
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
            pos++;
        }
        return slow;

    }
}
