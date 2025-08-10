public class Eighteenpattern {
    public static void eightpatt(int n){
for(int i=0;i<=n;i++){
    int charcode=65;
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=2*i-1;j++){
         System.out.print((char) charcode);
       if(j>(2*i-1)/2){
        charcode--;
       }
       else{
        charcode++;
       }
    }
    for(int j=1;j<=n-i;j++){
    }
    System.out.println();
}

    }
    public static void main(String[] args) {
        eightpatt(4);
    }
}
