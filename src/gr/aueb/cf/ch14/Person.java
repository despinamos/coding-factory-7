package gr.aueb.cf.ch14;

public class Person {
    private int id;
    private String firstname;
    private String lastname;

    public Person() {

    }

    public Person(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void work() {
        System.out.println("Works...");
    }

    public void speak() {
        System.out.println("Speaks...");
    }
}
