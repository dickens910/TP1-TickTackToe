/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttt.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author moumene
 */
@Entity
public class User {
    @Id
    @Column(name="numId",length=15)
    private String username;
    @Column(name="mdp",length=15)
    private String password;

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
