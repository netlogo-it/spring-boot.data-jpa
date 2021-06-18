package com.example.database.jpa.repository;

import com.example.database.jpa.model.beans.*;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface TestRepository extends JpaRepository<Test, Long> {

    /*
     * Esempio di come definire una select SQL JPA
     */
    @Query("SELECT DISTINCT a FROM Test a WHERE ?1 BETWEEN a.create_date AND a.modify_date")
    List<Test> selectTestFromDate(Date data);

    /*
     * Come sopra ma con la definizione dei parametri
     */
    @Query("SELECT DISTINCT a FROM Test a WHERE :d1 BETWEEN a.create_date AND a.modify_date")
    List<Test> selectTestFromDate2(@Param("d1") Date data);

    /*
     * Esempio di come definire una select nativa SQL
     */
    @Query(value = "SELECT sum(intero) FROM test WHERE id>:id1", nativeQuery = true)
    Integer sumId(@Param("id1") Long id);

    /*
     * Query nativa di update
     */
    @Modifying
    @Query(value = "UPDATE test SET intero=:num WHERE id=:id", nativeQuery = true)
    void updateTest(@Param("id") Long id, @Param("num") Integer num);
}
