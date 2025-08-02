import java.util.HashMap;
import java.util.Map;

public class frequency {
    public void findfreq(String str){
HashMap<Character,Integer>  hash=new HashMap<>();
for(int i=0;i<str.length();i++){
    char c=str.charAt(i);
    hash.put(c,hash.getOrDefault(c, 0)+1);
}
for(Map.Entry<Character,Integer> entry:hash.entrySet()){
    char key=entry.getKey();
    int value=entry.getValue();
    System.out.println("This is the Character: "+key+" this is its value: "+value);
}
    }
    public static void main(String[] args) {
        frequency fr=new frequency();
        String str="aaabcdeabcdhjopp";
        fr.findfreq(str);
    }
}
