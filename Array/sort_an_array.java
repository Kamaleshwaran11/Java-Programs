// This file is part of the Java project for sorting an array.
class sort_an_array{
    public static void main(String args[]){
        int[] arr={34,67,21,899,43,11,1};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                int temp=0;
                if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }
        
        System.out.println(arr[i]);
    }
}
}