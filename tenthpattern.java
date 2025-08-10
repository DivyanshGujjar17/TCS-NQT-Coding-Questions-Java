public class tenthpattern {
    public static void pt4(int n){
        for(int i=1;i<=n;i++){
            if(i%2!=0){
int start=1;
for(int j=1;j<=i;j++){
    System.out.print(start);
    start=1-start;
}
            }
            else{
int start=0;
for(int j=1;j<=i;j++){
    System.out.print(start);
    start=1-start;
}
            }
             System.out.println();
        }
       
    }
    public static void main(String[] args) {
        pt4(5);
    }
}
