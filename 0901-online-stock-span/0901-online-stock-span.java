class StockSpanner {
    Stack<int[]>st;
    public StockSpanner() {
        st=new Stack<>();
    }
    
    public int next(int price) {
        int today=1;
        while(!st.isEmpty() && st.peek()[0]<=price)
        {
            today+=st.peek()[1];
            st.pop();
        }
        st.push(new int[]{price,today});
        return today;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */