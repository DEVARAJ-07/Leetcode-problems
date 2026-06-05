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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        if(count<k) return head;
        int i=0;
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        while(i<k)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            i++;
        }
        head.next=reverseKGroup(curr,k);
        return prev;
    }
}