package gr.aueb.cf.ch12;

import java.sql.SQLOutput;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();
        Student bob = new Student(1, "Bob", "D.");

        student.id = 1;
        student.firstname = "Alice";
        student.lastname = "W.";

//        System.out.println("Id:" + student.id);
//        System.out.println("Firstname: " + student.firstname);
//        System.out.println("Lastname:" +student.lastname);

        System.out.println("Id: " + student.getId());
        System.out.println("Firstname: " + student.getFirstname());
        System.out.println("Lastname: " + student.getLastname());
    }
}
