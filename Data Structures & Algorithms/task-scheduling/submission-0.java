class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] taskFrequencies = new int[26];
        int maxFrequency = 0;

        for(char task : tasks){
            taskFrequencies[task - 'A']++;
            maxFrequency = Math.max(maxFrequency, taskFrequencies[task - 'A']);
        }

        int tasksWithMaxFrequency = 0;
        for(int freq : taskFrequencies){
            if(freq == maxFrequency) tasksWithMaxFrequency++;
        }

        int slotsNeeded = (maxFrequency - 1) * (n + 1) + tasksWithMaxFrequency;
        return Math.max(tasks.length, slotsNeeded);
    }
}
