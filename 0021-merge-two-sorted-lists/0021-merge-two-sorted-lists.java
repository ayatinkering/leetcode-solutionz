
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1=list1; ListNode l2=list2; 
        ListNode l3=new ListNode(0);
        ListNode head=l3;
        while(l1!=null || l2!=null){
            if(l1==null){
                l3.next=l2;
                return head.next;
            }else if (l2==null){
                l3.next=l1;
                return head.next;
            }
            else if(l1.val<l2.val || l1.val==l2.val){
                l3.next=l1;
                l1=l1.next;
                l3=l3.next;
            }else if (l2.val<l1.val){
                l3.next=l2;
                l2=l2.next;
                l3=l3.next;
            }
        }
        return head.next;
    }
}