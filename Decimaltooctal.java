public class Decimaltooctal {
    public void findectooctal(int n){
        StringBuilder finalstr=new StringBuilder();

while(n>0){
int value=0;
int rem=n%8;
finalstr.append(rem);
n=n/8;
}
String result=finalstr.reverse().toString();
System.out.println(result);
    }
    public static void main(String[] args) {
    Decimaltooctal dto=new Decimaltooctal();
    dto.findectooctal(145);
    }
}
