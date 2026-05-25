class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q =new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: stones)
        {
            q.offer(stone);
        }
        while(q.size()>1)
        {
            int y=q.poll();
            int x=q.poll();
            if(y!=x)
            {
                q.offer(y-x);
            }
        }
        return q.isEmpty()?0:q.peek();
    }
}