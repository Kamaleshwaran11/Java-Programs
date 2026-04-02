//arrange N soldiers in a line. rach solider has a value from 1 to R.
//Count all valid arrangeents satisy the three rules below:
//1. The value of the first soldier must be 1.
//2. The value of the last soldier must be end(given)
//3. No two adjacent soldiers can have the same value.


import java.util.*;

class prog3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int end = sc.nextInt();

        int count=0;

        for(int i=1;i<=r;i++){
            if(i==1 || i==end){
                count++;
            }
        }

        System.out.println(count);
    }
}