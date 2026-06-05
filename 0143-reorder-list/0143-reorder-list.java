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
    public ListNode reverse(ListNode temp)
    {
        ListNode prev=null, next=null;
        ListNode curr=temp;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null ) return ;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=reverse(slow.next);
        slow.next=null;
        ListNode t1=head, t2=temp;
        while(t2!=null)
        {
            ListNode n1 = t1.next;
            ListNode n2 = t2.next;
            t1.next = t2;
            t2.next = n1;
            t1 = n1;
            t2 = n2;
        }
    }
}