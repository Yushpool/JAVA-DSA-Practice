// import java.util.*;

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.age);
        System.out.println(this.name);
    }

    public Student(Student s2){
        this.age = s2.age;
        this.name = s2.name;
    }

    Student(){

    }
}

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 21;
        s1.name = "Ayush";
        Student s2 = new Student(s1);
        s2.printInfo();
        
    }

    
}