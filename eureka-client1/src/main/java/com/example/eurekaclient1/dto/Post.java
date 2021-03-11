package com.example.eurekaclient1.dto;

public class Post {
    private Long userId;
    private Long id;
    private String body;

    public Post(Long userId, Long id, String body) {
        this.userId = userId;
        this.id = id;
        this.body = body;
    }

    public Post() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
