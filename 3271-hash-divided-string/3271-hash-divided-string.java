class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i += k) {
            int sum = 0;
            for(int j = 0; j < k; j++) {
                char ch = s.charAt(i + j); 
                int num = ch - 'a';
                sum += num;
            }
            sum = sum % 26;
            char ch = (char)('a' + sum);
            sb.append(ch);
        }
        return sb.toString();
    }
}