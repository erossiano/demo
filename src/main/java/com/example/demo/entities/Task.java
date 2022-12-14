package com.example.demo.entities;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    @Column
    String description;
    @Column
    private Boolean done;
    @Column
    private LocalDate dueDate;

    public Task() { }
    public Task(String description, Boolean done, LocalDate date) {
        this.description = description;
        this.done = done;
        this.dueDate = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDone() {
        return this.done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public LocalDate getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
