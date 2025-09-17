package edu.ccrm.domain;

public class Course {
    private final String code;
    private final String title;
    private final int credits;
    private Instructor instructor;
    private final Semester semester;
    private final String department;

    private Course(CourseBuilder builder) {
        this.code = builder.code;
        this.title = builder.title;
        this.credits = builder.credits;
        this.instructor = builder.instructor;
        this.semester = builder.semester;
        this.department = builder.department;
    }
    
    public String getCode() { return code; }
    public String getTitle() { return title; }
    public int getCredits() { return credits; }
    public Instructor getInstructor() { return instructor; }
    public Semester getSemester() { return semester; }
    public String getDepartment() { return department; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }
    
    @Override
    public String toString() {
        String instructorName = (instructor != null) ? instructor.getFullName() : "TBD";
        return String.format("Course[Code=%s, Title=%s, Credits=%d, Dept=%s, Instructor=%s]",
            code, title, credits, department, instructorName);
    }

    public static class CourseBuilder {
        private final String code;
        private final String title;
        private int credits;
        private Instructor instructor;
        private Semester semester;
        private String department;

        public CourseBuilder(String code, String title) {
            this.code = code;
            this.title = title;
        }

        public CourseBuilder credits(int credits) {
            this.credits = credits;
            return this;
        }

        public CourseBuilder instructor(Instructor instructor) {
            this.instructor = instructor;
            return this;
        }

        public CourseBuilder semester(Semester semester) {
            this.semester = semester;
            return this;
        }

        public CourseBuilder department(String department) {
            this.department = department;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}