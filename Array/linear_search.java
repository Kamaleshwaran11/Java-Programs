class linear_search{
    public static void main(String args[]){
        int target=12;
        int arr[]={2,456,78,22,87654,2345,12,3245};

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("target found: "+arr[i]);
            }
        }
    }
}