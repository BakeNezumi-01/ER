package com.example.ER.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student extends User {
    @Id
    @Column(name = "id", nullable = false, unique=true)
    private long id;
    private String groupp;
    private String nameParent1;
    private String phoneParent1;
    private String nameParent2;
    private String phoneParent2;


    @Override
    public Long getId() {
        return id;
    }

    public String getGroupp() {
        return groupp;
    }

    public void setGroup(String groupp) {
        this.groupp = groupp;
    }

    public String getNameParent1() {
        return nameParent1;
    }

    public void setNameParent1(String nameParent1) {
        this.nameParent1 = nameParent1;
    }

    public String getPhoneParent1() {
        return phoneParent1;
    }

    public void setPhoneParent1(String phoneParent1) {
        this.phoneParent1 = phoneParent1;
    }

    public String getNameParent2() {
        return nameParent2;
    }

    public void setNameParent2(String nameParent2) {
        this.nameParent2 = nameParent2;
    }

    public String getPhoneParent2() {
        return phoneParent2;
    }

    public void setPhoneParent2(String phoneParent2) {
        this.phoneParent2 = phoneParent2;
    }

    public Student(){
    }

    public Student(String username, String password, String email, String name,
                   String lastName, String middleName, String birthday, String phone,
                   String nameParent1, String phoneParent1, String nameParent2, String phoneParent2){
        this.id = new User(username, password, email, name, lastName, middleName,  birthday, phone).getId();
        this.nameParent1 = nameParent1;
        this.phoneParent1 = phoneParent1;
        this.nameParent2 = nameParent2;
        this.phoneParent2 = phoneParent2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", groupp='" + groupp + '\'' +
                ", nameParent1='" + nameParent1 + '\'' +
                ", phoneParent1='" + phoneParent1 + '\'' +
                ", nameParent2='" + nameParent2 + '\'' +
                ", phoneParent2='" + phoneParent2 + '\'' +
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
