package edu.ccrm.domain;

import java.time.LocalDate;

public abstract class Person {
    private int id;
    private String fullName;
    private String email;
    
    public Person(int id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public abstract String getProfileDetails();

    @Override
    public String toString() {
        return "Person[id=" + id + ", fullName='" + fullName + "']";
    }
}