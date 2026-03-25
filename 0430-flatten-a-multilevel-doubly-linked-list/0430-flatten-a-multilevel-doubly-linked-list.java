/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null){
            return null;
        }
        Node cur=head;
        while(cur!=null){
            if(cur.child!=null){
                Node up=cur.next;
                cur.next=flatten(cur.child);
                cur.next.prev=cur;
                cur.child=null;
                while(cur.next!=null)
                    cur=cur.next;
                if(up!=null){
                cur.next=up;
                up.prev=cur;
                }
            }
            cur=cur.next;
        }
        return head;
    }
}