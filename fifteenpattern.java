public class fifteenpattern {
    public static void fifteenpatt(int n){
        for(int i=1;i<=n;i++){
            int charcode=65;
            for(int j=1;j<=n-i;j++){
                char a=(char) charcode;
                System.out.print(a);
                charcode++;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        fifteenpatt(6);
    }

}
