package com.example.database.jpa.model.beans;

import javax.persistence.*;
import java.io.Serializable;

import it.sysx.abstracts.AModelBean;
import it.sysx.interfaces.IUsergroup;

@Entity
@Table(name = "usergroup",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"groupname"}, name = "groupname_unique")
        }
)
public class Usergroup extends AModelBean implements IUsergroup, Serializable {

    @Column(name = "groupname")
    private String groupname;

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getGroupname() {
        return this.groupname;
    }

    @Column(name = "description")
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

}
