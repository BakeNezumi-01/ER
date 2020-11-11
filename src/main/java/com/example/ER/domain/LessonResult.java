package com.example.ER.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "lessonResult")
public class LessonResult implements Serializable { // make two tables instead that? for attendance and grade
    @Id
    private long idLesson;
    @Id
    private long idStudent;
    private boolean attendance;
    private int grade;

    public LessonResult(){}

    public LessonResult(long idLesson, long idStudent, boolean attendance, int grade){
        this.idLesson = idLesson;
        this.idStudent = idStudent;
        this.attendance = attendance;
        this.grade = grade;
    }

    public boolean isAttendance() {
        return attendance;
    }

    public void setAttendance(boolean attendance) {
        this.attendance = attendance;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LessonResult)) return false;
        LessonResult that = (LessonResult) o;
        return idLesson == that.idLesson &&
                idStudent == that.idStudent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLesson, idStudent);
    }

    @Override
    public String toString() {
        return "LessonResult{" +
                "idLesson=" + idLesson +
                ", idStudent=" + idStudent +
                ", attendance=" + attendance +
                ", grade=" + grade +
                '}';
    }
}
