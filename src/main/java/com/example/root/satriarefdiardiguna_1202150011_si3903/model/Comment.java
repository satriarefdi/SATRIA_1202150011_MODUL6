package com.example.root.satriarefdiardiguna_1202150011_si3903.model;



public class Comment {
    String id;
    String username;
    String comment;

    public Comment(){}

    public Comment(String id, String username, String comment) {
        this.id = id;
        this.username = username;
        this.comment = comment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
