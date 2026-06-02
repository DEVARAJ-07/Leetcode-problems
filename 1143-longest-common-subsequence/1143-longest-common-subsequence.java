class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int l1=t1.length(),l2=t2.length();
        t1=" "+t1;
        t2=" "+t2;
        int dp[][]=new int[l1+1][l2+1];
        for(int i=1;i<=l1;i++)
        {
            for(int j=1;j<=l2;j++)
            {
                if(t1.charAt(i)==t2.charAt(j))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[l1][l2];
    }
}
