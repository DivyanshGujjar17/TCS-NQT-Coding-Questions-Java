public class Lcm {
    public void findlcm(int a,int b){
int product=a*b;
int hcf=findhcf(a,b);
int lcm=product/hcf;
System.out.println(lcm);

    }
    public int findhcf(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Lcm lk=new Lcm();
        lk.findlcm(48, 36);
    }
}
