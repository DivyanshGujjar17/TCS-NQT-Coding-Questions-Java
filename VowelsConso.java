public class VowelsConso {
    public void findcons(String str){
        int n=str.length();
        int vowels=0;
        int conso=0;
        int space=0;
for(int i=0;i<n;i++){
    char c=str.charAt(i);
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
        vowels++;
}
else if(c==' '){
    space++;
}
else{
    conso++;
}
}
System.out.println("vowels:"+vowels+"conso:"+conso+"space:"+space);
    }
    public static void main(String[] args) {
        VowelsConso ps=new VowelsConso();
        String str="ab  ba";
        ps.findcons(str);
    }
}
