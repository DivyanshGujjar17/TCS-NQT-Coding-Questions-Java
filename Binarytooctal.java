public class Binarytooctal {
    public void btoconversion(int n){
        String s = Integer.toString(n); // input is decimal representation of binary (e.g., 10110110)
        String newstr = "";

        // Step 1: Padding to make length multiple of 3
        int i = 0;
        while ((i + s.length()) % 3 != 0) {
            i++;
        }

        StringBuilder stf = new StringBuilder();
        for (int j = 0; j < i; j++) {
            stf.append('0');
        }
        stf.append(s);

        int result = 0;
        int currentindex = 0;
        int m = stf.length() - 1;
        for (int j = m; j >= 0; j--) {
            char c = stf.charAt(j);
            if (c == '1') {
                result += Math.pow(2, currentindex);
            }
            currentindex++;
            if (currentindex == 3) {
                newstr = result + newstr;
                result = 0;
                currentindex = 0;
            }
        }

        System.out.println("Octal: " + newstr);
    }

    public static void main(String[] args) {
        Binarytooctal bto = new Binarytooctal();
        int n = 10110110; 
        bto.btoconversion(n); 
    }
}
