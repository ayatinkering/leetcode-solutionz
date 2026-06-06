/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int l=0; int i=0;
        ListNode temp=head;
        while(temp!=null){
            l++;
            temp=temp.next;
        }
        int mid=l/2;
        temp=head;
        while(i<mid){
            temp=temp.next;
            i++;
        }
        return temp;
    }
}