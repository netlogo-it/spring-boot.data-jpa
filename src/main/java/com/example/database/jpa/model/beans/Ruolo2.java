package com.example.database.jpa.model.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ruolo2")
public class Ruolo2 implements Serializable {

    @Id
    @TableGenerator(
            name = "ruolo2",
            table = "progressivi",
            pkColumnName = "tipo",
            valueColumnName = "progressivo",
            allocationSize = 100
    )
    @GeneratedValue(generator = "ruolo2")
    private Long id;

    @Column
    private String ruolo2;

    public String getRuolo2() {
        return ruolo2;
    }

    public void setRuolo2(String ruolo2) {
        this.ruolo2 = ruolo2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
