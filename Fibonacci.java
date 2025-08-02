public class Fibonacci {
    public int findfibo(int term){
        if(term==1){
return 1;
        }
        if(term==0){
            return 0;
        }
        return findfibo(term-1)+findfibo(term-2);
    }
    public static void main(String[] args) {
        Fibonacci fgb=new Fibonacci();
   int result= fgb.findfibo(12); 
   System.out.println(result);
    }
}
