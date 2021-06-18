package com.example.database.jpa.model.beans;

import javax.persistence.*;
import java.io.Serializable;

import it.sysx.abstracts.AModelBean;
import it.sysx.interfaces.IUser;
import it.sysx.interfaces.IUsergroup;

@Entity
@Table(name = "user")
public class User extends AModelBean implements IUser, Serializable {

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Usergroup.class)
    @JoinColumn(name = "usergroup")
    private IUsergroup usergroup;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ente")
    private Ente ente;


    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setUsergroup(it.sysx.interfaces.IUsergroup usergroup) {
        this.usergroup = usergroup;
    }

    public it.sysx.interfaces.IUsergroup getUsergroup() {
        return this.usergroup;
    }

    public void setEnte(Ente ente) {
        this.ente = ente;
    }

    public Ente getEnte() {
        return this.ente;
    }


}
