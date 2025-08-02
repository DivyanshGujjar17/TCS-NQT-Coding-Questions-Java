public class Factorial {
    public int fact(int n){
if(n==1||n==0){
    return 1;
}
int result=n;
return result*fact(n-1);
    }
    public static void main(String[] args) {
        Factorial fp=new Factorial();
        System.out.println(fp.fact(5));
    }
}
