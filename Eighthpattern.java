public class Eighthpattern {
    public static void eightptt(int n){
for(int i=1;i<=n;i++){
    for(int j=0;j<i;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=2*(n-i)+1;j++){
        System.out.print("*");
    }
    System.out.println();
}
    }
    public static void main(String[] args) {
        eightptt(6);
        
    }
}
