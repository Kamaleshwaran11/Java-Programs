class count_odd_even{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
         if(arr[i]%2==0){
            even++;
         }else if(arr[i]%2==1){
            odd++;
         }
        }
        System.out.println("Count the Even Numbers of an array:"+even);
        System.out.println("Count the odd numbers of an array:"+odd);
    }
}