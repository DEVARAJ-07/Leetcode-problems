class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack <Integer> st=new Stack<>();
        Queue <Integer> q=new LinkedList<>();
        for(int i=sandwiches.length-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        for(int i=0;i<students.length;i++){
            q.offer(students[i]);
        }
        int reg=0;
        while(!q.isEmpty() && !st.isEmpty()){
            if(q.peek()==st.peek()){
                q.poll();
                st.pop();
                reg=0;
            }
            else{
                q.offer(q.poll());
                reg++;
            }
            if(reg==q.size()){
                return q.size();
            }
        }
        return 0;
    }
}