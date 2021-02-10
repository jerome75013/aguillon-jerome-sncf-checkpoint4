package com.glucip.apiCheckPoint4.model;

import javax.persistence.*;

@Entity
@Table(name = "glucip")
public class Glucip {

    private long id;
    private String name;
    private String description;
    private String url;
    private String category;

    public Glucip() {
    }

    public Glucip(String name,String description,String url,String category) {
        this.name = name;
        this.description = description;
        this.url = url;
        this.category = category;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "description", nullable = false)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "url", nullable = false)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Column(name = "category", nullable = false)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString(){
        return "Post [id=" + id + ", name=" + name + ", description=" + description + ", category=" + category
                + "]";
    }
}
}
