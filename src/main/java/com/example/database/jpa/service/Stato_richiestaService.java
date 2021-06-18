package com.example.database.jpa.service;

import com.example.database.jpa.model.beans.*;
import com.example.database.jpa.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Stato_richiestaService {

    @Autowired
    Stato_richiestaRepository stato_richiestaRepository;

    @Transactional(readOnly = true)
    public Stato_richiesta findByStato() {
        return stato_richiestaRepository.findByStato("ASSEGNATA");
    }

}
