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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        List<Integer> lst= new ArrayList<>();
        int size=0;
        while(temp!=null)
        {
            lst.add(temp.val);
            temp=temp.next;
            size++;
        }
        int arr[]=new int[size];
        Stack<Integer> st= new Stack<>();
        Arrays.fill(arr,0);
        ListNode curr=head;
        for(int i=0;i<size;i++)
        {
            while(!st.isEmpty()&& lst.get(st.peek())<lst.get(i))
            {
                arr[st.pop()]=lst.get(i);
            }
            st.push(i);
        }
        return arr;
    }
}