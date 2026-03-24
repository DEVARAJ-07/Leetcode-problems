class BrowserHistory {
    class Node
    {
        String url;
        Node prev;
        Node next;
        Node(String url)
        {
            this.url=url;
            prev=null;
            next=null;
        } 
    }
    Node cur;
    public BrowserHistory(String homepage) {
        cur=new Node(homepage);
    }
    
    public void visit(String url) {
        Node nn=new Node(url);
        cur.next=nn;
        nn.prev=cur;
        cur=nn;
    }
    
    public String back(int steps) {
        while(cur.prev!=null && steps-- > 0)
        {
            cur=cur.prev;
        }
        return cur.url;
    }
    
    public String forward(int steps) {
        while(cur.next!=null && steps-- > 0)
        {
            cur=cur.next;
        }
        return cur.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */