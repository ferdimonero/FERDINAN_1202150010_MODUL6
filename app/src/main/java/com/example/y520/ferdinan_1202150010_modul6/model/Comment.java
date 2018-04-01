package com.example.y520.ferdinan_1202150010_modul6.model;

/**
 * Created by Y520 on 4/1/2018.
 */

public class Comment {

    String id;
    String username;
    String comment;
    Long timestamp;

    public Comment() {
    }

    public Comment(String id, String username, String comment, Long timestamp) {
        this.id=id;
        this.username = username;
        this.comment = comment;
        this.timestamp=timestamp;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getComment() {
        return comment;
    }
}
