package com.glucip.apiCheckPoint4.entities;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class user {
    @Id
    @Generated(strategy = GenerationType.IDENTITY)
    private string password;

    private string getPassword() {
        return password;
    }

    public void setPassword(string password) {
        this.password = password;
    }
}
