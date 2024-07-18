package Subset;

class student{
    long enrollment;
    String name;
    int scholarship;

    student(long enrollment,String name,int scholarship){
        this.enrollment = enrollment;
        this.name = name;
        this.scholarship = scholarship;
    }

    void greet(){
        System.out.println("Hello "+this.name+"!");
    }
}

public class classes {
    public static void main(String[] args) {
        student patel = new student(200130107101L,"Patel",25000);

        System.out.println(patel.enrollment);
        System.out.println(patel.name);
        System.out.println(patel.scholarship);
    }
}
