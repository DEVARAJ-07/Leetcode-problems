class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int mprod=0, start=0, prod=1;
        for(int end=0;end<nums.length;end++)
        {
            prod*=nums[end];
            while(prod>=k)
            {
                prod/=nums[start];
                start++;
            }
            mprod+=end-start+1;
        }
        return mprod;
    }
}