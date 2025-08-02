public class StrongNum {
    public void findstrong(int n){
int result=0;
int currentnum=n;
while(n>0){
    int digit=n%10;
    int facto=findfacto(digit);
    
    result+=facto;
    n=n/10;
}
System.out.println(result);
    }
    public int findfacto(int s){
if(s==1||s==0){
    return 1;
}
int result=s;
return result*findfacto(s-1);
    }
    public static void main(String[] args) {
        StrongNum sn=new StrongNum();
        sn.findstrong(145);
    }
}
