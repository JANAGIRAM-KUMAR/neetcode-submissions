class Solution {
    public String reorganizeString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        maxHeap.addAll(map.keySet());

        StringBuilder sb = new StringBuilder();

        while (maxHeap.size() > 1) {
            char char1 = maxHeap.poll();
            char char2 = maxHeap.poll();

            sb.append(char1);
            sb.append(char2);

            map.put(char1, map.get(char1) - 1);
            map.put(char2, map.get(char2) - 1);

            if (map.get(char1) > 0) {
                maxHeap.offer(char1);
            }
            if (map.get(char2) > 0) {
                maxHeap.offer(char2);
            }
        }

        if (!maxHeap.isEmpty()) {
            char lastChar = maxHeap.poll();
            if (map.get(lastChar) > 1) {
                return ""; 
            }
            sb.append(lastChar);
        }

        return sb.toString();
    }
}