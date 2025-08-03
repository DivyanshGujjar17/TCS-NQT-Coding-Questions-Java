public class OctaltoBinary {
    public void converse(int n) {
        String sty = "";
        
        while(n > 0) {
            int digit = n % 10;  
            String str = FindBinaryOfOctalDigit(digit); 
            sty = str + sty;
            n = n / 10;
        }

        System.out.println("Binary equivalent: " + sty);
    }
    public String FindBinaryOfOctalDigit(int n) {
        StringBuilder binary = new StringBuilder();

        while(n > 0) {
            int remainder = n % 2;
            binary.append(remainder);
            n = n / 2;
        }

        // Pad with 0s to make 3 bits
        while(binary.length() < 3) {
            binary.append('0');
        }

        return binary.reverse().toString();
    }

    public static void main(String[] args) {
        OctaltoBinary oct = new OctaltoBinary();
        oct.converse(25);
    }
}

