
import java.util.Arrays;

//To remove the duplicate array of an given element
class Duplicate_array{
    public static void main(String args[]){

        int[] arr={21,34,45,45,34,67,21};
        
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                
                System.out.println(arr[i]);
            }
            
        }
        System.out.println(arr[arr.length-1]); 
    }
}