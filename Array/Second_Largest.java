
import java.util.Arrays;

//To Find the Second Largest in an array
class Second_Largest{
    public static void main(String args[]){
        int[] arr={234,236,8987,3456,2345,8765};
        Arrays.sort(arr);
        int second=0;
        for(int i=0;i<arr.length-1;i++){
            second=arr[i];
        }
        System.out.println(second);

    }
}