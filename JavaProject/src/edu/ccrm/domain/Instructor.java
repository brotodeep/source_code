package edu.ccrm.domain;

public class Instructor extends Person {
    private String department;
    private String officeLocation;

    public Instructor(int id, String fullName, String email, String department) {
        super(id, fullName, email);
        this.department = department;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public String getOfficeLocation() { return officeLocation; }
    public void setOfficeLocation(String officeLocation) { this.officeLocation = officeLocation; }

    @Override
    public String getProfileDetails() {
        return "INSTRUCTOR | Name: " + getFullName() + " | Department: " + department;
    }
}