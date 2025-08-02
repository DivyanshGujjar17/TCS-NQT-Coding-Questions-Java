public class ReverseString {
    public void reverse(String s){
        int n=s.length()-1;
       char[] ch=s.toCharArray();
       for(int i=0;i<n/2;i++){
        char temp=ch[i];
        ch[i]=ch[n-i];
        ch[n-i]=temp;
       }
       System.out.println(ch);

    }
    public static void main(String[] args) {
        ReverseString rs=new ReverseString();
        String s="Hello World";
        rs.reverse(s);
    }
}
