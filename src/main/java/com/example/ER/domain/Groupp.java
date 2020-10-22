package com.example.ER.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Groupp {
    @Id
    private String name;
    private long kurator; //fix it

    public Groupp(){
    }

    public Groupp(String name, long kurator){
        this.kurator = kurator;
        this.name = name;
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
