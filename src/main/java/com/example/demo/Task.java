package com.example.demo;

import java.time.LocalDate;

public class Task {
    private String description;
    private Boolean done;
    private LocalDate dueDate;

    public Task(String description, Boolean done, LocalDate date) {
        this.description = description;
        this.done = done;
        this.dueDate = date;
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
