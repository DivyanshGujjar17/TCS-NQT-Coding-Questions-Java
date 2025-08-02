public class PallindromOrNot {
    public void findnum(int n){
        int current=n;
        String stj="";
        while(n>0){
           int digit=n%10;
            n=n/10;
          stj+=digit;
        } 
    int nmbr=Integer.parseInt(stj);
    if(nmbr==current){
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }
    }
    public static void main(String[] args) {
        PallindromOrNot pon=new PallindromOrNot();
        pon.findnum(1221);
    }
}
