public class Solution {
    public String licenseKeyFormatting(String S, int K) {
        String S1 = S.replace("-","");
        S1 = S1.toUpperCase();
        StringBuilder sb = new StringBuilder();
         for(int i=0; i<S1.length();i++) {
            sb.append(S1.charAt(i));
        }
        int len = sb.toString().length();
        for(int i=K; i < len; i=i+K) {
                sb.insert(len-i,'-');
            }
        return sb.toString();   
    }
}