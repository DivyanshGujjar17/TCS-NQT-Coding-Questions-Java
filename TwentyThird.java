public class TwentyThird {
    public static void ttpatt(int n) {
        // Total rows = 2n - 1
        for (int i = 1; i <= 2 * n - 1; i++) {
            int row = i <= n ? i : 2 * n - i; // Mirror logic

            // Left side (descending)
            int left = n;
            for (int j = 1; j <= row; j++) {
                System.out.print(left);
                left--;
            }

            // Middle repeating
            int midVal = n - row + 1;
            int midCount = 2 * (n - row) - 1;
            for (int j = 1; j <= midCount; j++) {
                System.out.print(midVal);
            }

            // Right side (ascending)
            int right = n - row + 2;
            for (int j = 1; j < row; j++) {
                System.out.print(right);
                right++;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        ttpatt(4);
    }
}
