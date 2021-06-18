package com.example.database.jpa.repository;

import com.example.database.jpa.model.beans.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Stato_richiestaRepository extends JpaRepository<Stato_richiesta, Long> {

    /*
     * E' possibile definire una interfaccia che permette di richestare un elemento dallo stato.
     * Spring capisce dal nome cosa deve cercare
     */
    public Stato_richiesta findByStato(String stato);


}
