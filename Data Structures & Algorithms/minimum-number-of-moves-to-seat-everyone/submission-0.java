class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int max_seats = 0;
        int max_students = 0;
        for(int s : seats) if(s > max_seats) max_seats = s;
        for(int s : students) if(s > max_students) max_students = s;
        int max = Math.max(max_seats,max_students) + 1;
        int[] count_seats = new int[max];
        int[] count_students = new int[max];
        for(int s : seats) count_seats[s] += 1;
        for(int s : students) count_students[s] += 1;

        int i = 0, j = 0;
        int moves = 0;
        int r = students.length;
        while(r > 0){
            if(count_seats[i] == 0) {i += 1; continue; }
            if(count_students[j] == 0) {j += 1; continue;}
                moves += Math.abs(j - i);
                count_seats[i] -= 1;
                count_students[j] -= 1;
                r--;
        }
        return moves;
    }
}