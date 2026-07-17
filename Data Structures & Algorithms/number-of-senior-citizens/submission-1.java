class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String d : details){
            // StringBuilder sb = new StringBuilder();
            // sb.append(d.charAt(11));
            // sb.append(d.charAt(12));
            String sb = d.substring(11,13);
            int age = Integer.parseInt(sb);
            if(age > 60) count++;
        }
        return count;
    }
}