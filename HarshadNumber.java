public class HarshadNumber {
    public void harshad(int n){
        int current=n;
int result=0;
while(n>0){
    int digit=n%10;
    result+=digit;
    n=n/10;
}
if(current%result==0){
    System.out.println(true);
}
else{
    System.out.println(false);
}
    }
    public static void main(String[] args) {
        HarshadNumber hn=new HarshadNumber();
    }
}
