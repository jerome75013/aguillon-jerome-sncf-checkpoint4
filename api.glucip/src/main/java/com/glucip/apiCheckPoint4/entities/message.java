package com.glucip.apiCheckPoint4.entities;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="message")
public class message {
    @Id
    @Generated(strategy = GenerationType.IDENTITY)
    private string name;
    private string lastname;
    private string subject;
    private string content;
    private string mail;

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public string getLastname() {
        return lastname;
    }

    public void setLastname(string lastname) {
        this.lastname = lastname;
    }

    public string getSubject() {
        return subject;
    }

    public void setSubject(string subject) {
        this.subject = subject;
    }

    public string getContent() {
        return content;
    }

    public void setContent(string content) {
        this.content = content;
    }

    public string getMail() {
        return mail;
    }

    public void setMail(string mail) {
        this.mail = mail;
    }
}
