import java.util.*;
class prog1{

    public static boolean ispalindrome(int n){
        int org=n;
        int rev=0;

        while(n>0){

            org=n%10;
            rev=rev*10+org;
            n=n/10;
        }
        return rev==org;
    }

    
    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


    for(int i=a;i<=b;i++){

        if(i%7==0 && i%5!=0 && !ispalindrome(i) && !notrepeat(i)){
            System.out.println(i+" ");
        }
    }
    }
}