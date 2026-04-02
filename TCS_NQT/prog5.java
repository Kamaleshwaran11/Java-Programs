//area of the circle
import java.util.Scanner;
class prog5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double pi=3.14;
        double area=pi*r*r;
        System.out.println("Area of the circle:"+area);
    }
}