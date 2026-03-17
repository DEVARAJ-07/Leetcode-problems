class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int a = 0; a < nums.length; a++) {
            for (int b = a + 1; b < nums.length; b++) {
                if (nums[a] + nums[b] == target) {
                    int[] result = new int[2];
                    result[0] = a;
                    result[1] = b;
                    return result;
                }
            }
        }
        int[] result = new int[2];
        return result;
    }
}
