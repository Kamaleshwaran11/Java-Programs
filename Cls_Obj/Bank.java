class SK_bank{
    int account_no;
    String name;
    int balance;
    int amount;

    void deposit(){
        System.out.println(amount + " Deposited successfully");
    }
    void withdraw(){
        System.out.println(amount + " Withdrawn successfully");
    }
}
class Bank{
    public static void main(String args[]){

        SK_bank obj1=new SK_bank();
        obj1.amount= 5000;
        obj1.deposit();

    }
}