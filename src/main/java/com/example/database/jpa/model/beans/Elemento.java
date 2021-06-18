package com.example.database.jpa.model.beans;

import it.sysx.abstracts.AModelBean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "elemento")
public class Elemento extends AModelBean implements Serializable {

    @Column
    private String elemento;

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

}
