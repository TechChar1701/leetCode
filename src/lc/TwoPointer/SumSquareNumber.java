package src.lc.TwoPointer;

public class SumSquareNumber {
    public static void main(String[] args) {
        judgeSquareSum(3);
    }
    public static boolean judgeSquareSum(int c) {
        long start = 0;
        long end = (long) Math.sqrt(c);

        while (start <= end) {
            long val = start * start + end * end;
            if (val > c) {
                end--;
            } else if (val == c) {
                return true;
            } else {
                start++;
            }
        }
        return false;
    }
}
