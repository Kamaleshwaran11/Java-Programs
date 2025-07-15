class sum_avg{
    public static void main(String args[]){
        int[] arr={32,45,67,99,7};

        int sum=0;
        int avg=0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of an given array:"+sum);
        avg=sum/arr.length;
        System.out.println("Avg of an array:"+avg);
    }
}