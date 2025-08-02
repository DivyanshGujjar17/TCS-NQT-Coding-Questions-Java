public class Capitalize {
    public void capital(String str){
        int n=str.length();
      StringBuilder sb=new StringBuilder();
char[] arr=str.toCharArray();
for(int i=0;i<n;i++){
    if(i==0||i==n-1){
        arr[i]=Character.toUpperCase(arr[i]);
    }
    else if(arr[i]==' '){
        arr[i-1]=Character.toUpperCase(arr[i-1]);
        arr[i+1]=Character.toUpperCase(arr[i+1]);
    }
}
for(int i=0;i<n;i++){
    sb.append(arr[i]);
}
    }
        public static void main(String[] args) {
    Capitalize cp=new Capitalize();
    cp.capital("hello world");
    }
}
