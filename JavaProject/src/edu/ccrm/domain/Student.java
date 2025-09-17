package edu.ccrm.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student extends Person {
    private final String regNo;
    private final LocalDate registrationDate;
    private final List<Enrollment> enrollments;

    public Student(int id, String fullName, String email, String regNo, LocalDate registrationDate) {
        super(id, fullName, email);
        this.regNo = regNo;
        this.registrationDate = registrationDate;
        this.enrollments = new ArrayList<>();
    }

    public String getRegNo() { return regNo; }
    public LocalDate getRegistrationDate() { return registrationDate; }
    public List<Enrollment> getEnrollments() { return new ArrayList<>(enrollments); } // Defensive copy
    public void addEnrollment(Enrollment enrollment) { this.enrollments.add(enrollment); }

    @Override
    public String getProfileDetails() {
        return "STUDENT | Name: " + getFullName() + " | Reg No: " + regNo;
    }
    
    public String generateTranscript() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- TRANSCRIPT FOR ").append(getFullName()).append(" ---\n");
        if (enrollments.isEmpty()) {
            sb.append("No courses enrolled.\n");
        } else {
            for (Enrollment e : enrollments) {
                sb.append(e.getCourse().getTitle())
                  .append(": ")
                  .append(e.getGrade())
                  .append(" (").append(e.getGrade().getGradePoint()).append(" pts)\n");
            }
        }
        sb.append("------------------------------------------\n");
        return sb.toString();
    }
}