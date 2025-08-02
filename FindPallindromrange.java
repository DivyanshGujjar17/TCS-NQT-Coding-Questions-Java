public class FindPallindromrange {
    public void findrange(int start,int end){
for(int i=start;i<=end;i++){
    if(ispallindrom(i)){
        System.out.println(i);
    }
}
    }
    public boolean ispallindrom(int n){
          int current=n;
        String stj="";
        while(n>0){
           int digit=n%10;
            n=n/10;
          stj+=digit;
        } 
    int nmbr=Integer.parseInt(stj);
    if(nmbr==current){
       return true;
    }
    else{
        return false;
    }
    }
    public static void main(String[] args) {
        FindPallindromrange fpr=new FindPallindromrange();
        fpr.findrange(10, 100);
    }
}
