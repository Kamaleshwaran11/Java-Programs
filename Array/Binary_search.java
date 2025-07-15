class Binary_search{
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6,7,8};
        int target1=7;
        int target2=2;
        
int mid=arr[arr.length/2];
        for(int i=0;i<arr.length;i++){

            if(arr[i]>mid && arr[i]==target1){
                System.out.println("target 1 found");
            }else if(arr[i]<mid && arr[i]==target1){
                System.out.println("target 1 found");
            }
        }
        for(int i=0;i<arr.length;i++){
               if(arr[i]>mid && arr[i]==target2){
                System.out.println("target 2 found");
            }else if(arr[i]<mid && arr[i]==target2){
                System.out.println("target 2 found");
            }
        }

    }
}