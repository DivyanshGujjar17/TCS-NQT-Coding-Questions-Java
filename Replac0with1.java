public class Replac0with1 {
    public void replace(int n){
String outpu="";
while(n>0){
    int digit=n%10;
    if(digit==0){
        outpu+=1;
    }
    else{
        outpu+=digit;
    }
    n=n/10;
}
System.out.println(outpu);
String newstr="";
int leng=outpu.length();
for(int j=leng-1;j>=0;j-- ){
     char c=outpu.charAt(j);
     newstr+=c;
}
System.out.println(newstr);
    }
    public static void main(String[] args) {
        Replac0with1 rp=new Replac0with1();
        rp.replace(1000001156);
    }
}
