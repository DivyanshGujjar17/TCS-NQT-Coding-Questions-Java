public class Armstrong {
    public void arm(int n){
int count=0;
int currentval=n;
while(currentval>0){
    currentval=currentval/10;
    count++;
}
int result=0;
int finalvalue=n;
System.out.println(finalvalue);
while(finalvalue>0){
    int digit=finalvalue%10;
    int num=digit;
    for(int i=1;i<3;i++){
        digit*=num;
    }
result+=digit;
    finalvalue=finalvalue/10;
}
System.out.println();
    }
    public static void main(String[] args) {
        Armstrong ar=new Armstrong();
        ar.arm(153);
    }
}
