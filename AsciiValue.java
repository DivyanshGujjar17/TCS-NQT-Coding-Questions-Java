public class AsciiValue {
    public void finascii(char c){
int code=(int)c;
System.out.println(code);
    }
    public static void main(String[] args) {
        AsciiValue av=new AsciiValue();
        av.finascii('z');
    }
}
