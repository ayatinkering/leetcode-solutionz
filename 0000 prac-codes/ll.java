public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { 
            this.val = val; }
     ListNode(int val, ListNode next) { 
            this.val = val; 
            this.next = next; }
 }

public class ll {
    public ListNode insertBeginning(ListNode head, int val){
        ListNode newnode= new ListNode(val);
        newnode.next=head;
        head=newnode;
        return head;
    }

    public ListNode insertEnd(ListNode head,int val){
        ListNode newnode=new ListNode(val);
        newnode.next=null;
        if (head==null){
            head=newnode;
        }else{
            ListNode temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
        return head;

    }

    public boolean search(ListNode head,int target){
        ListNode temp=head;
        while(temp!=null){
            if(temp.val==target){return true;}
            temp=temp.next;
        }
        return false;
    }

    public ListNode delbyvalue(ListNode head,int target){
        ListNode temp=head;
        ListNode prev=temp;
        if(head==null){
            return head;
        }
        if(head.val==target){
            head=head.next;
            return head;
        }
        while(temp.next!=null){
            if(temp.next.val==target){
                temp.next=temp.next.next;
                return head;
            }
            prev=temp;
            temp=temp.next;
        }
        if(temp.val==target){
            prev.next=null;
        }
        return head;
    }

    public int length(ListNode head){
        ListNode temp=head; int l=0;
        while(temp!=null){ 
            System.out.println(temp.val+" -> ");
            l++;
            temp=temp.next;
        }
        return l;
    }

    public ListNode reverse(ListNode head){
        ListNode curr=head; 
        ListNode prev=null;
        ListNode next=null;

        while(curr!=null){
            next=curr.next; 
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    } 
}


