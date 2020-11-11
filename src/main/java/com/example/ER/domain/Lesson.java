package com.example.ER.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Lesson {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique=true)
    private long id;
    private Date date;
    private long teacher;

    @Column(name = "groupname")
    private String groupName;
    private String discipline;//TODO enum
    private String homeWork;
    private String comment;

    public Lesson(){
    }

    public Lesson(Date date, long teacher, String discipline){
        this.date = date;
        this.teacher = teacher;
        this.discipline = discipline;
    }

    public long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getTeacher() {
        return teacher;
    }

    public void setTeacher(long teacher) {
        this.teacher = teacher;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getHomeWork() {
        return homeWork;
    }

    public void setHomeWork(String homeWork) {
        this.homeWork = homeWork;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", date=" + date +
                ", teacher=" + teacher +
                ", groupName='" + groupName + '\'' +
                ", discipline='" + discipline + '\'' +
                ", homeWork='" + homeWork + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
