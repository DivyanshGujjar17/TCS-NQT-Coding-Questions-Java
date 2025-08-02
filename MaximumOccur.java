import java.util.HashMap;
import java.util.Map;
public class MaximumOccur {
    public void findmax(String s){
int n=s.length();
HashMap<Character,Integer> maxhas=new HashMap<>();
for(int i=0;i<n;i++){
    char g=s.charAt(i);
maxhas.put(g,maxhas.getOrDefault(g,0)+1);
}
int maxvalue=0;
char a=s.charAt(0);
for (Map.Entry<Character,Integer> entry:maxhas.entrySet()) {
int currentvalue=entry.getValue();
char currentkey=entry.getKey();
if(currentvalue>maxvalue){
    maxvalue=currentvalue;
    a=currentkey;
}
else if(currentvalue==maxvalue){
    if(currentkey<a){   
a=currentkey;
    }
}
}
 System.out.println(maxvalue);
    }
    public static void main(String[] args) {
        MaximumOccur mo=new MaximumOccur();
        String s="aaaaabbbcccdj";
        mo.findmax(s);
    }
}
