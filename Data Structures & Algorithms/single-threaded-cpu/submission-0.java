class Solution {
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        int[][] extendedTasks = new int[n][3];
        for (int i = 0; i < n; i++) 
            extendedTasks[i] = new int[] {tasks[i][0], tasks[i][1], i};
        Arrays.sort(extendedTasks, (a, b) -> a[0] - b[0]);
        int[] result = new int[n];
        PriorityQueue<int[]> availableTasksQueue = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });
      
        int taskIndex = 0;        
        int currentTime = 0;      
        int resultIndex = 0;      
      
        while (!availableTasksQueue.isEmpty() || taskIndex < n) {
            if (availableTasksQueue.isEmpty()) {
                currentTime = Math.max(currentTime, extendedTasks[taskIndex][0]);
            }
            while (taskIndex < n && extendedTasks[taskIndex][0] <= currentTime) {
                availableTasksQueue.offer(new int[] {
                    extendedTasks[taskIndex][1],  
                    extendedTasks[taskIndex][2]  
                });
                taskIndex++;
            }
          
            int[] nextTask = availableTasksQueue.poll();
            result[resultIndex++] = nextTask[1];  
            currentTime += nextTask[0];           
        }
      
        return result;
    }
}
