class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int rep=0;
        int ws=0;
        for(int we=0;we<nums.length;we++){
            if(nums[we]==0)
            rep++;
            while(rep>k){
                if(nums[ws]==0)
                rep--;
                ws++;
            }
             max=Math.max(max,we-ws+1);
        }
        return max;
    }
}