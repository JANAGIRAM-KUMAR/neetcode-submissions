class Solution {
    public String largestNumber(int[] nums) {
        List<String> arr = new ArrayList<>();
        for(int num : nums){
            arr.add(String.valueOf(num));
        }

        arr.sort((a,b) -> (b+a).compareTo(a+b));

        if(arr.get(0).equals("0")) return "0";

        return String.join("",arr);
    }
}

