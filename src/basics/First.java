package basics;

class Student {
    static int collegeCode = 101;

    static void display() {
        System.out.println("Hello");
    }
}

public class First {
    public static void main(String[] args) {

//        System.out.println("Hello World!");
        System.out.println(Student.collegeCode);
        Student.collegeCode = 105;
        System.out.println(Student.collegeCode);
        Student.display();
    }
}
