public class Binarytodecimal {
public void conversionbtod(int n){
    double result=0;
int i=0;
    while(n>0){
int digit=n%10;
if(digit==0){
  result+=0; 
  i++; 
  n=n/10;
}
else{
    double value=Math.pow(2, i);
result+=value*digit;
i++;
n=n/10;
}

    }
    System.out.println(result);


}
// public int findvalue(int value){
// if(value==0){
//     return 1;
// }
// int out=2;
// for(int j=1;j<value;j++){
//     out*=2;
// }
// return out;
// }
    public static void main(String[] args) {
        Binarytodecimal btd=new Binarytodecimal();
        btd.conversionbtod(11111);
    }
}