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
    public ListNode reverselist(ListNode head)
    {
        ListNode curr=head;
        ListNode prev=null,nextnode;
        while(curr!=null)
        {
            nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;

        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rev=reverselist(slow);
        while(head!=null && rev!=null)
        {
            if(head.val!=rev.val) 
                return false;
            head=head.next;
            rev=rev.next;
        }
        return true;
    }
}