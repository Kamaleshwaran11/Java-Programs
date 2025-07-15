class copy_one_another{
    public static void main(String args[]){
        int[] a={21,34,56};
        int b[]=new int[a.length];

        for(int i=0;i<a.length;i++){
            b[i]=a[i];
            
        }
        for(int i=0;i<b.length;i++){
        System.out.println(b[i]);
        }
    }
}