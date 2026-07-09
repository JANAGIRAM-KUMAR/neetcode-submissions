class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = new List[numCourses];
        Arrays.setAll(graph, index -> new ArrayList<>());

        int[] inDegree = new int[numCourses];
        for(int[] prerequisite : prerequisites){
            int course = prerequisite[0];
            int prerequisiteCourse = prerequisite[1];
            graph[prerequisiteCourse].add(course);
            inDegree[course]++;
        }

        Deque<Integer> q = new LinkedList<>();

        for(int c = 0; c < numCourses; c++){
            if(inDegree[c] == 0) q.offer(c);
        }
        while(!q.isEmpty()){
            int currentCourse = q.poll();
            numCourses--;
            for(int dependentCourse : graph[currentCourse]){
                inDegree[dependentCourse]--;
                if(inDegree[dependentCourse] == 0)
                    q.offer(dependentCourse);
            }
        }


        return numCourses == 0;
    }
}
