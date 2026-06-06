class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head; ListNode newlist=new ListNode(0);
        ListNode og=newlist;
        while(temp!=null){
            ListNode newnode=new ListNode(temp.val);
            og.next=newnode;
            og=og.next;
            temp=temp.next;
        }newlist=newlist.next;
        ListNode curr=head; ListNode prev=null; ListNode next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        while(head!=null&& newlist!=null){
            if(head.val!=newlist.val){return false;}
            head=head.next;
            newlist=newlist.next;
        }
        return true;
    }
}