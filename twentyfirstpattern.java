public class twentyfirstpattern {
    public static void twtwoptt(int n){
        for(int i=1;i<=2*n-1;i++){
            int spaces=2*(n-i);
            int stars=i;
            if(i>n){
                stars=2*n-i;
                spaces=2*(i-n);
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=stars;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        twtwoptt(5);
    }
}
