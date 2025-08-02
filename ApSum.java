public class ApSum {
public void findap(int n,int a,int d){
int sum=2*a+(n-1)*d;
int result=n*sum/2;
System.out.println(result);
}
    public static void main(String[] args) {
    ApSum apn=new ApSum();
    apn.findap(10, 2, 2);
    
    }
}
