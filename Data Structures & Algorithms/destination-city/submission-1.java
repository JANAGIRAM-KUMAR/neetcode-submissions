class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for(List<String> path : paths){
            map.put(path.get(0),path.get(1));
        }
        for(Map.Entry<String, String> entry : map.entrySet()){
            if(!map.containsKey(entry.getValue())) return entry.getValue();
        }
        return "";
    }
}
