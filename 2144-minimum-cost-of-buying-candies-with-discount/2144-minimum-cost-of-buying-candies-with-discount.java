class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum=0;
        int len=cost.length;
        for(int i=0;i<len;i+=3)
        {
            sum+=cost[len-1-i];
            if(i+1<len){
                sum+=cost[len-1-(i+1)];
            }
        }
        return sum;
    }
}