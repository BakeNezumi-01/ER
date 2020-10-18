package com.example.ER.domain;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

public class Group {
    @Id
    private String name;
    private long kurator; //fix it
    List<Student> studentList = new ArrayList<>();

    public Group(){
    }

    public Group(String name){
        this.name = name;
    }

    public void addStudent(long id){
        //studentList.add(id)
        //TODO fix it
    }

    public void deleteStudent(long id){
        //studentList.add(id)
        //TODO fix it
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getKurator() {
        return kurator;
    }

    public void setKurator(long kurator) {
        this.kurator = kurator;
    }
}
