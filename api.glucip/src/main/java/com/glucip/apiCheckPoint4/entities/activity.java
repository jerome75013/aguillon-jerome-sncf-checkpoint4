package com.glucip.apiCheckPoint4.entities;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="activity")
public class activity {
    @Id
    @Generated(strategy = GenerationType.IDENTITY)
    private Long id;
    private string name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }
}