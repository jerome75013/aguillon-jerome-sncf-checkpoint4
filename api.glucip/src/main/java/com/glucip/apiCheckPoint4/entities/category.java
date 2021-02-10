package com.glucip.apiCheckPoint4.entities;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class category {
    @Id
    @Generated(strategy = GenerationType.IDENTITY)
    private string name;

    private string getName() {
        return name;
    }

    private void setName(string name) {
        this.name = name;
    }
}
