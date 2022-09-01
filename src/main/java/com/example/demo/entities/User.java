package com.example.demo.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "name")
    private String name;
    @Column(name = "image")
    private String image;
    @Column(name = "auth0Id", unique = true)
    private String outh0Id;

    public User() {
    }

    public User(String email, String image, String outh0Id) {
        this.email = email;
        this.image = image;
        this.outh0Id = outh0Id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getOuth0Id() {
        return outh0Id;
    }

    public void setOuth0Id(String outh0Id) {
        this.outh0Id = outh0Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
