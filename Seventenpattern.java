public class Seventenpattern {
    public static void sevenpatt(int n){
        int charcode=65;
        for(int i=1;i<=n;i++){
            char x=(char) charcode;
            for(int j=1;j<=i;j++){
System.out.print(x);
            }
            charcode++;
            System.out.println();
        }

    }
    public static void main(String[] args) {
        sevenpatt(5);
    }
}
