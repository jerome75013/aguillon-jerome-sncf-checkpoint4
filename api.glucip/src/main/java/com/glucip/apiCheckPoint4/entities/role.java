package com.glucip.apiCheckPoint4.entities;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class role {
    @Id
    @Generated(strategy = GenerationType.IDENTITY)
    private string Role;

    private string getRole() {
        return Role;
    }

    public void setRole(string role) {
        Role = role;
    }
}