class Solution {
    public List<Integer> findClosestElements(int[] a, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < k; i++) {
            pq.add(a[i]);
        }
        int j = k;
        while( j < a.length) {
            if(Math.abs(x - pq.peek()) > Math.abs(x - a[j])) {
                pq.poll();
                pq.add(a[j]);
            }
            j++;
        }
        List<Integer> ans = new ArrayList<>();
        while(!pq.isEmpty()) {
            ans.add(pq.poll());
        }
        return ans;
    }
}