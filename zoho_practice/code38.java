
import java.util.Arrays;

class code38{
    static int[] panlindrome(int num1,int num2,int n){
        int[] result=new int[n+1];
        /*result[0]=num1;*/
        for(int i=1;i<=n;i++){
            
            
            int nxt=num1+num2;
            num1=num2;
            num2=nxt;

            result[i]=num1;
        }
        return result;
    }
    public static void main(String args[]){
     int n=6;
     int num1=0;
     int num2=1;
    System.out.println(Arrays.toString(panlindrome(num1,num2,n)));
    }
}