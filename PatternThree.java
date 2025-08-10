public class PatternThree {
    public void findpatt3(int n){
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(j);
    }
    System.out.println();
}
    }
    public static void main(String[] args) {
        PatternThree ptt=new PatternThree();
        ptt.findpatt3(5);
    }
}
