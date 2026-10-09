class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            st.push(sandwiches[i]);
        }
        int sq = 0, cr = 0;
        for(int s : students){
            if(s == 0) cr++;
            else sq++;
        }

        while(!st.isEmpty()){
            if(st.peek() == 0 && cr > 0){
                st.pop();
                cr--;
            } else if(st.peek() == 1 && sq > 0){
                st.pop();
                sq--;
            } else {
                break;
            }
        }

        return cr+sq;


    }
}