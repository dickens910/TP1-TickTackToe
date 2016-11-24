package com.ttt.entites;


/**
 *
 * @author moumene
 */

public class User {
    private String username,password;

    public User() {
        this.username = "";
        this.password = "";
    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
