package com.example.demo.models;

import jdk.jfr.Timestamp;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.DATE)
    private SimpleDateFormat date;


    private String title;
    private boolean urgent;
    private boolean done;


    public Todo(String tile) {
        this.title = tile;
        this.date = new SimpleDateFormat("yyyy-MM-dd");
    }

    public Todo() {

    }

    public Long getId() {
        return id;
    }

    private java.sql.Date parseDate(String date) {
        try {
            return (java.sql.Date) new Date(this.date.parse(date).getTime());
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
