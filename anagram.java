import java.util.Arrays;

public class anagram {
    public void angra(String s,String t){
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
      if(  Arrays.equals(arr1, arr2)){
      System.out.println("true");
      }
      else{
    System.out.println("false");
      }


    }
    public static void main(String[] args) {
      anagram ag=new anagram();
      String s="silent";
      String t="listen";
      ag.angra(s,t);
    }
}
