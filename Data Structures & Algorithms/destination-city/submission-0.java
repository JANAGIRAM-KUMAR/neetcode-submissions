class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for(List<String> path : paths){
            String src = path.get(0);
            String des = path.get(1);
            map.put(src,des);
        }

        for(Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey();
            String val = entry.getValue();

            if(!map.containsKey(val)) return val;
        }

        return "";
    }
}
