public class FifthPattern {
    public void fifthpatt(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        FifthPattern fp=new FifthPattern();
        fp.fifthpatt(5);
        
    }
}
