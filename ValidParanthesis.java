import java.util.Stack;

public class ValidParanthesis {
    public static void vp(String s){
        boolean isvalid=true;
Stack<Character> stk=new Stack<>();
for(int i=0;i<s.length();i++){
    char c=s.charAt(i);
if(c==')'||c=='}'||c==']'){
    if(!stk.isEmpty()){
        char g=stk.peek();
if(c=='('&&g==')'||c=='{'&&g=='}'||c=='['&&g==']'){
    stk.pop();
}
else{
    isvalid=false;
    break;
}

    }
    else{
        isvalid=false;
        break;
    }
}
else{
    stk.push(c);
}
}
System.out.println(isvalid);
    }
    public static void main(String[] args) {
        ValidParanthesis p=new ValidParanthesis();

p.vp("([])");
p.vp( "([)]");
    }
}
