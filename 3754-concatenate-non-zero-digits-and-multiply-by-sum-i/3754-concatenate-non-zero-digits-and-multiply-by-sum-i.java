class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb=new StringBuilder();
        String str=String.valueOf(n);
        long sum=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!='0') 
            {
                sb.append(str.charAt(i));
                sum+=str.charAt(i)-'0';
            }
        }
        if(sb.toString().equals("")) return 0;
        long num=Long.parseLong(sb.toString());
        return num*sum;
    }
}



