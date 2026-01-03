class student{
    
    String name;
    int rollNo;
    int dept;

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Department: " + dept);
    }
}

class Main{
    public static void main(String args[]){
        student s1 = new student();
        s1.name = "John Doe";
        s1.rollNo = 101;
        s1.dept = 5;

        student s2 = new student();
        s2.name = "Jane Smith";
        s2.rollNo = 102;
        s2.dept = 6;

        System.out.println("Student 1 Details:");
        s1.display();
        
        System.out.println("\nStudent 2 Details:");
        s2.display();
    }
}