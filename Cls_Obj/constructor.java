class constructor{
    //String name;
    public constructor(String name){
        System.out.println(name+" Constructor called");
    }

    public static void main(String[] args) {
        constructor obj = new constructor("kamal");
        System.out.println("Object created successfully");
    }
}