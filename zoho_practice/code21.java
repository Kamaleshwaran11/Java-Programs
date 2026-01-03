public class code21 {

    void odd(int[] arr){
        int i;
        for(i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
                if (arr[i] % 2 == 1) {
                    System.out.print(arr[i]);
                }
        }
    }
    void even(int[] arr){
        int i;
        for(i=arr.length-1;i>0;i--) {
            for (int j = arr.length-1; j > i+1; j--) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i]);
            }
        }}
    public static void main(String args[]){
        int[] arr={5,8,11,6,2,1,7};
        code21 k=new code21();
        k.odd(arr);
        k.even(arr);
    }
}
