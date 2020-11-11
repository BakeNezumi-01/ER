package com.example.ER.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher extends User {
    @Id
    @Column(name = "id", nullable = false, unique=true)
    private long id;
    private String disciplines; // ?? mb it must be refactored

    @Override
    public Long getId() {
        return id;
    }

    public String getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(String disciplines) {
        this.disciplines = disciplines;
    }

    public Teacher(){
    }

    public Teacher(long id, String disciplines){
        this.id = id;
        this.disciplines = disciplines;
    }

    public Teacher(String username, String password, String email, String name,
                   String lastName, String middleName, String birthday, String phone,
                   String disciplines){
        this.id = new User(username, password, email, name, lastName, middleName,  birthday, phone).getId();
        this.disciplines = disciplines;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", disciplines='" + disciplines + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", middlename='" + middlename + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
