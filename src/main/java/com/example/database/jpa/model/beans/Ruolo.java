package com.example.database.jpa.model.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ruolo")
public class Ruolo implements Serializable {

    /*
     * strategy = GenerationType.AUTO
     * Crea una tabella separata 'hibernate_sequence' dove viene salvato l'ID da utilizzare
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String ruolo;

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
