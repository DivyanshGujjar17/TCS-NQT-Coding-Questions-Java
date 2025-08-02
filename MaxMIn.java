public class MaxMIn {
    public void finmaxmin(int n){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
while(n>0){
int digit=n%10;
if(digit<min){
    min=digit;
}
if(digit>max){
    max=digit;
}
n=n/10;

}
    }
    public static void main(String[] args) {
        MaxMIn mxm=new MaxMIn();

    }
}
