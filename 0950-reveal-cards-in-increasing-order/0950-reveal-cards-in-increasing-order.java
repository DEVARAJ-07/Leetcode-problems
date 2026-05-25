class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue <Integer> q=new LinkedList<>();
        for(int i=0;i<deck.length;i++)
        q.offer(i);
        int[] ans=new int[deck.length];
        for(int card:deck){
            int index=q.poll();
            ans[index]=card;
            if(!q.isEmpty())
            q.offer(q.poll());
        }
        return ans;
    }
}
