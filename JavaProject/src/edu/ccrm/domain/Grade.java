package edu.ccrm.domain;

public enum Grade {
    S(10), A(9), B(8), C(7), D(6), F(0), NA(-1);

    private final int gradePoint;

    Grade(int gradePoint) {
        this.gradePoint = gradePoint;
    }

    public int getGradePoint() {
        return gradePoint;
    }
}