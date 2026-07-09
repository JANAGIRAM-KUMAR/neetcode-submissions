import "sort"
func minMovesToSeat(seats []int, students []int) int {
    sort.Ints(seats)
    sort.Ints(students)

    moves := 0

    for i := 0; i < len(seats); i++ {
        if seats[i] > students[i] {
            moves += seats[i] - students[i]
        } else {
            moves += students[i] - seats[i]
        }
    }
    return moves
}
