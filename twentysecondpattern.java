public class twentysecondpattern {
    public static void twenpatt(int n){
        for(int i=1;i<=n;i++){
            int spaces=n-2;
            int stars=1;
            if(i==1||i==n){
                spaces=0;
              stars=n/2;
            }
            
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
System.out.println();
        }

    }
    public static void main(String[] args) {
        twenpatt(6);
    }
}
