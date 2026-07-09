class Twitter {
    Map<Integer, List<Integer>> userTweetMap;
    Map<Integer, Set<Integer>> userFollowingMap;
    Map<Integer, Integer> tweetTimestampsMap;
    int timestamps;

    public Twitter() {
        userTweetMap = new HashMap<>();
        userFollowingMap = new HashMap<>();
        tweetTimestampsMap = new HashMap<>();
        timestamps = 0;
    }
    
    public void postTweet(int userId, int tweetId) {
        userTweetMap.computeIfAbsent(userId, k -> new ArrayList<>()).add(tweetId);
        tweetTimestampsMap.put(tweetId, ++timestamps);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        Set<Integer> followingSet = userFollowingMap.getOrDefault(userId, new HashSet<>());
        Set<Integer> allRelevantUsers = new HashSet<>(followingSet);
        allRelevantUsers.add(userId);
        PriorityQueue<Integer> tweetQueue = new PriorityQueue<>((a,b) -> tweetTimestampsMap.get(b) - tweetTimestampsMap.get(a));
        for(Integer currUID: allRelevantUsers){
        List<Integer> currUserTweet = userTweetMap.get(currUID);
        if (currUserTweet != null && !currUserTweet.isEmpty()) {
                int tweetsToAdd = Math.min(10, currUserTweet.size());
                for (int i = currUserTweet.size() - 1; 
                    i >= currUserTweet.size() - tweetsToAdd; 
                    i--) {
                   tweetQueue.offer(currUserTweet.get(i));
                }
        }
        }
        List<Integer> newsFeed = new ArrayList<>();
        while (!tweetQueue.isEmpty() && newsFeed.size() < 10) {
                newsFeed.add(tweetQueue.poll());
           }
        
            return newsFeed;
    }
    
    public void follow(int followerId, int followeeId) {
        userFollowingMap.computeIfAbsent(followerId, k -> new HashSet<>()).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        userFollowingMap.computeIfAbsent(followerId, k -> new HashSet<>()).remove(followeeId);
    }
}
