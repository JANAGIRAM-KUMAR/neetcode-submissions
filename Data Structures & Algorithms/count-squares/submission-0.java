class CountSquares {
    Map<Integer,Map<Integer,Integer>> hm;
    public CountSquares() {
        hm = new HashMap<>();
    }
    
    public void add(int[] point) {
        int x = point[0];
        int y = point[1];
        if(!hm.containsKey(x)){
            hm.put(x,new HashMap<>());
        }
        hm.get(x).put(y,hm.get(x).getOrDefault(y,0)+1);  
    }
    
    public int count(int[] point) {
        int res = 0, x1 = point[0], y1 = point[1];
        if(!hm.containsKey(x1)) return res;
        for(int y2 : hm.get(x1).keySet()){
            int side = y2 - y1;
            if(side == 0) continue;

            int x3 = x1 + side, x4 = x1 - side;

            res += hm.get(x1).get(y2) * hm.getOrDefault(x3, new HashMap<>()).getOrDefault(y1,0) * hm.getOrDefault(x3, new HashMap<>()).getOrDefault(y2,0);
            res += hm.get(x1).get(y2) * hm.getOrDefault(x4, new HashMap<>()).getOrDefault(y1,0) * hm.getOrDefault(x4, new HashMap<>()).getOrDefault(y2,0);
        }
        return res;
    }
}
