class TimeMap {

    private Map<String, List<Data>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)) map.put(key, new ArrayList<>());
        map.get(key).add(new Data(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        List<Data> data = map.get(key);
        return findClosest(data, timestamp);
    }

    private String findClosest(List<Data> data,int timestamp){
        int l = 0, r = data.size() - 1;
        while(l<r){
            int m = (l+r+1)/2;
            if(data.get(m).timestamp <= timestamp) l = m;
            else r = m - 1;
        }
        Data closest = data.get(l);
        return closest.timestamp > timestamp ? "" : closest.value;
    }

    class Data {
        String value;
        int timestamp;
        Data (String value, int timestamp){
            this.value = value;
            this.timestamp = timestamp;
        }
    }
}
