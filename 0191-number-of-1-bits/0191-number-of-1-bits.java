class Solution {
    public int hammingWeight(int n) {
        int oneBits = 0;
        while (n > 0) {
            oneBits += n % 2;
            n = Math.floorDiv(n, 2);
        }
        return oneBits;
    }
}