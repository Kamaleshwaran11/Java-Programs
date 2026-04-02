
import java.util.Scanner;

class month{

    static int findmonth(String month){
        if(month.equals("Febraury")){
            return 28;
        }
        else if(month.equals("January") || month.equals("March") || month.equals("May") || month.equals("July") || month.equals("August") || month.equals("October") || month.equals("December")){
            return 31;
        }
        else if(month.equals("April") || month.equals("June") || month.equals("September") || month.equals("November")){
            return 30;
        }
            return -1;
        
    }
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the month");
String month=sc.nextLine();

System.out.println(findmonth(month));


    }
}