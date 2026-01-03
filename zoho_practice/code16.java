public class code16 {
    public void add(int a,int b){
        int c=a+b;
        System.out.println("Addition:"+c);
    }
    void sub(int a,int b){
        int c=a+(-b);
        System.out.println("Sub:"+c);
    }
    void multi(int a,int b){
        int c=a*b;
        System.out.println("Multi:"+c);
    }
    int div(int a,int b){
        int c=a/b;
        return c;
        //System.out.println("div:"+c);
    }
    public static void main(String args[]){
        code16 c=new code16();
        int a=-6;
        int b=-4;
        c.add(a,b);
        c.sub(a,b);
        c.multi(a,b);
        System.out.println(c.div(a,b));
    }
}
