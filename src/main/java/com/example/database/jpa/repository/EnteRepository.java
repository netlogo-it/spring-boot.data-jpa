package com.example.database.jpa.repository;

import com.example.database.jpa.model.beans.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EnteRepository extends JpaRepository<Ente, Long> {

}
