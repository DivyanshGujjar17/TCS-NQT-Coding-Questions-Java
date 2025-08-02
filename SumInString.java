public class SumInString {
    public void sum(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
char c=s.charAt(i);
if(c=='1'){
    sum+=1;
}
else if(c=='2'){
                sum+=2;
            }
            else if(c=='3'){
                sum+=3;
            }
            else if(c=='4'){
                sum+=4;
            }
            else if(c=='5'){
                sum+=5;
            }
            else if(c=='6'){
                sum+=6;
            }
            else if(c=='7'){
                sum+=7;
            } 
            else if(c=='8'){
sum+=8;
            }
            else if(c=='9'){
                sum+=9;
                            }
                            else{
                                sum+=0;
                            }
            
        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        SumInString sm=new SumInString();
        String s="1234567890";
        sm.sum(s);
    }   
}
