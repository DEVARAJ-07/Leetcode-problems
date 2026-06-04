class Solution {
    public boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return true;
        return false;
    }
    public int maxVowels(String s, int k) {
        int start=0, c=0, max=0;
        for(int end=0;end<s.length();end++)
        {
            char ch=s.charAt(end);
            if(isVowel(ch)) c++;
            if(end>=k)
            {
                if(isVowel(s.charAt(start)))
                {
                    c--;
                }
                start++;
            }
            max=Math.max(max, c);
        }
        return max;
    }
}