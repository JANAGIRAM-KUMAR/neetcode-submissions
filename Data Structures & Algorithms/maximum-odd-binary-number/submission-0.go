func maximumOddBinaryNumber(s string) string {
    countOnes := 0
    countZeros := 0
    for _, c := range s{
        if c == '1' {
            countOnes++
        } else {
            countZeros++
        }
    }
    res := strings.Repeat("1",countOnes - 1) + strings.Repeat("0",countZeros) + "1"
    return res
}
