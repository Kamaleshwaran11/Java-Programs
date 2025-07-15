class max_min {
    public static void main(String[] args) {
        int[] arr={8,10,5,20,1,7};
        int min=arr[0];
        int max=arr[0];
        
    System.out.println("array of an element: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for(int i=1;i<arr.length;i++){
           if(max<arr[i]){
            max=arr[i];
           }else if(min>arr[i]){
            min=arr[i];
           }
        }

        System.out.println("Maximum element of an array: "+max);
        System.out.println("Minimum element of an array: "+min);
        
        
    }
}