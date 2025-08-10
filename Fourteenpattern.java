public class Fourteenpattern {
    public static void Fourteenpat(int n){
for(int i=1;i<=n;i++){
    int charco=65;
   
   for(int j=1;j<=i;j++){
    char c=(char) charco;
       System.out.print(c);
       charco++;
    }
    System.out.println();
}
    }
    public static void main(String[] args) {
Fourteenpat(5);
    }
}
