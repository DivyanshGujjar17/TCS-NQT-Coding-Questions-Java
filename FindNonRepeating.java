import java.util.HashMap;
import java.util.Map;

public class FindNonRepeating {
public void Findnon(String str){
HashMap<Character,Integer>  hash=new HashMap<>();
for(int i=0;i<str.length();i++){
    char c=str.charAt(i);
    hash.put(c,hash.getOrDefault(c, 0)+1);
}

for(Map.Entry<Character,Integer> entry:hash.entrySet()){
    char key=entry.getKey();
    int value=entry.getValue();
    if(value<2){
    System.out.println("This is the Character: "+key);
}
}
}
    public static void main(String[] args) {
        FindNonRepeating fnr=new FindNonRepeating();
        String str="aabcdefgywta";
        fnr.Findnon(str);
    }
}