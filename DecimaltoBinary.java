public class DecimaltoBinary {
    public void finddecimaltob(int n){
        StringBuilder newstr=new StringBuilder();
        while(n!=0){
            int value=0;
            if(n%2==0){
                value=0;
            }
            else{
                value=1;
            }
            n=n/2;
            newstr.append(value);
        }
String st=newstr.reverse().toString();
System.out.println(st);
    }
    public static void main(String[] args) {
        DecimaltoBinary dcb=new DecimaltoBinary();
        dcb.finddecimaltob(10);
    }
    
}
