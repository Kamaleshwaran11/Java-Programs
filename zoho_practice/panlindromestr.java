class panlindromestr{
    public static void main(String args[]){
        String str="MADAM";
        String rev="";

        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(str+" is a panlindrome string");
        }else{
            System.out.println(str+" is not a panlindrome string");
        }
    }
}