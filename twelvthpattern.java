public class twelvthpattern {
    public static void twelvepatt(int n){
        for(int i=1;i<=2*n-1;i++){
            int spaces=i-1;
            int stars=2*(n-i)+1;
            if(i>n){
                spaces=2*n-1-i;
                stars=2*(i-n)+1;
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
    twelvepatt(7);
   } 
}
