class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> lst = new ArrayList<>();
        for(int i=1;i<=9;i++)
        {
            int num=i;
            for(int j=i+1;j<=9;j++)
            {
                num=num*10+j;
                if(num>=low && num<=high)
                {
                    lst.add(num);
                }
            }
        }
        Collections.sort(lst);
        return lst;
    }
}