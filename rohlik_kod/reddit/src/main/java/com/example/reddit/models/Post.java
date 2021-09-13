package com.example.reddit.models;

import javax.persistence.*;
import java.net.URL;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String url;

    @Temporal( TemporalType.TIMESTAMP)
    private Date timestamp;


    @ManyToOne
    private User owner;

    private Integer score;
//------------END of Fields ---------------------------------


    public Post() {
    }

    public Post(String title, String url) {
        this.title = title;
        this.url = url;
        this.score = 0;
       this.timestamp = new Date();
    }

    //-------Get --- SET ---------------------------------------


    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
    public Long getId() {
        return id;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
