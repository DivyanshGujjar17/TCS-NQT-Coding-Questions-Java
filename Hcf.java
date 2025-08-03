public class Hcf {
    public void findHcf(int a,int b){
while(b!=0){
    int temp=b;
    b=a%b;
    a=temp;
}
System.out.println(a);
    }
    public static void main(String[] args) {
        Hcf hc=new Hcf();
        hc.findHcf(48,36);
    }
}
