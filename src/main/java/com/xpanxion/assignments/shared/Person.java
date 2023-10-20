package com.xpanxion.assignments.shared;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    public Person(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getId(){return this.id;}
    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public String toString() {
        return "Person{id="+this.id+", firstName='"+this.firstName+"', lastName='"+this.lastName+"'}";
    }
}
