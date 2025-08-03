public class AutomorphicNumber {
    public void finauto(int n) {
        int square = n * n;
        int temp = n; 
        String str = "";
        while (temp > 0) {
            int digit = square % 10;
            str = digit + str;  
            square /= 10;
            temp /= 10;
        }

        if (Integer.parseInt(str) == n) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        AutomorphicNumber an = new AutomorphicNumber();
        an.finauto(5);   // true
        an.finauto(6);   // true
        an.finauto(76);  // true
        an.finauto(7);   // false
    }
}
