class MyLinkedList {
    class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        next=null;
      }
   }
   Node head;
   int cnt;
    public MyLinkedList() {
       head=null;
       cnt=0;
    }
    public int get(int index) {
        if(index<0 || index>=cnt)
           return -1;
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node nn=new Node(val);
        nn.next=head;
        head=nn;
        cnt++;
    }
    public void addAtTail(int val) {
        Node nn=new Node(val);
        if(head==null){
            head=nn;
        }
        else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
          }
        temp.next=nn;
        }
        cnt++;
    }
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > cnt) return;   
        if (index == 0) {                      
            addAtHead(val);
            return;
        }
        Node nn=new Node(val);
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        nn.next=temp.next;
        temp.next=nn;
        cnt++;
    }
    public void deleteAtIndex(int index) {
         if (index < 0 || index >= cnt) return; 
         if (index == 0) {                      
            head = head.next;
          } 
         else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) { 
                temp = temp.next;
            }
            temp.next = temp.next.next;       
         }
         cnt--;                           
       }
    }