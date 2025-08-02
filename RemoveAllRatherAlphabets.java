public class RemoveAllRatherAlphabets {
    public void removerather(String s){
        int n=s.length();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            int code= (int)c;
            if(code>=65&&code<=90||code>=97&&code<=122){
                str.append(c);
        }
    }
    System.out.println(str.toString());
    }
    public static void main(String[] args) {
        RemoveAllRatherAlphabets rar=new RemoveAllRatherAlphabets();
        String s="diaio5565d5ju84";
        rar.removerather(s);
    }
}
