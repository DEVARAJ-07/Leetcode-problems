class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int []indegree =new int[numCourses];
        for(int []pre:prerequisites){
            int course=pre[0];
            int prerequisite=pre[1];
            adj.get(prerequisite).add(course);
            indegree[course]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int comp=0;
        while(!q.isEmpty()){
            int temp=q.poll();
            comp++;
            for(int n:adj.get(temp)){
                indegree[n]--;
                if(indegree[n]==0){
                    q.offer(n);
                }
            }
        }
        return comp==numCourses;
    }
}