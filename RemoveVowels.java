public class RemoveVowels {
    public void Remove(String s){
int n=s.length();
StringBuilder str=new StringBuilder();
for(int i=0;i<n;i++){
    char c=s.charAt(i);
    if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u'){
        str.append(c);
}
 
}
System.out.println(str.toString());
}
public static void main(String[] args) {
    RemoveVowels rv=new RemoveVowels();
    String s="ackdksmlsodie";
    rv.Remove(s);
}
}
