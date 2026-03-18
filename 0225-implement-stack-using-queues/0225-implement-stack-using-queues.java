class MyStack {
    Queue<Integer>q1;
    public MyStack() {
        q1=new LinkedList<>();
    }
    
    public void push(int x) {

        if(q1.isEmpty())
            q1.offer(x);
        else
        {
            int n= q1.size();
            q1.offer(x);
            while(n>0)
            {
                q1.offer(q1.poll());
                n--;
            }

        }
        
        // if(q1.isEmpty())
        //     q1.offer(x);
        // else
        // {
        // while(!q1.isEmpty())
        // {
        //     q2.offer(q1.poll());
        // }
        // q1.offer(x);
        // while(!q2.isEmpty())
        // {
        //     q1.offer(q2.poll());
        // }
        // } 
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */