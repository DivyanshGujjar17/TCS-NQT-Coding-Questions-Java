public class PerfectNumber {
    public void pfn(int n){
int finalsum=0;
for(int i=1;i*2<=n;i++){
    if(n%i==0){
        finalsum+=i;
    }
}
if(finalsum==n){
    System.out.println(true);
}
else{
    System.out.println(false);
}
    }
    public static void main(String[] args) {
        PerfectNumber p=new PerfectNumber();
        p.pfn(28);
    }
}
