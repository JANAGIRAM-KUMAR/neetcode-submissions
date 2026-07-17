class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String d : details){
            StringBuilder sb = new StringBuilder();
            sb.append(d.charAt(11));
            sb.append(d.charAt(12));
            int age = Integer.parseInt(sb.toString());
            if(age > 60) count++;
        }
        return count;
    }
}