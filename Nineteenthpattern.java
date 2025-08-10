public class Nineteenthpattern {
    public static void nineptt(int n){
                for(int i=1;i<=n;i++){
             int charcode=70;
            int count=charcode-i;
            for(int j=1;j<=i;j++){
            System.out.print(" "+(char) count);
            count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Nineteenthpattern ntp=new Nineteenthpattern();
        nineptt(5);

    }
}
