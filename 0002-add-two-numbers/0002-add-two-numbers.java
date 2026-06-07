class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0); int carry=0;
        ListNode head=l3;
        while(l1!=null || l2!=null){
            if(l1==null){
                ListNode newnode=new ListNode((l2.val+carry)%10);
                carry=(l2.val+carry)/10;
                l3.next=newnode;
                l2=l2.next; l3=l3.next;
            }
            else if(l2==null){
                ListNode newnode=new ListNode((l1.val+carry)%10);
                carry=(l1.val+carry)/10;
                l3.next=newnode;
                l1=l1.next; l3=l3.next;
            }
            else {
                ListNode newnode=new ListNode((l1.val+l2.val+carry)%10);
                carry=(l1.val+l2.val+carry)/10;
                l3.next=newnode;
                l1=l1.next; l2=l2.next; l3=l3.next;
            }
        }
        if(carry!=0){
            ListNode newnode=new ListNode(carry);
            l3.next=newnode;
        }
        return head.next;
    }
}