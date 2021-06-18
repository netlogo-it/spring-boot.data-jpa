package com.example.database.jpa.model.beans;

import javax.persistence.*;
import java.io.Serializable;

import it.sysx.abstracts.AModelBean;

@Entity
@Table(name = "stato_richiesta")
public class Stato_richiesta extends AModelBean implements Serializable {

    @Column(name = "stato")
    private String stato;

    public void setStato(String stato) {
        this.stato = stato;
    }

    public String getStato() {
        return this.stato;
    }

}
