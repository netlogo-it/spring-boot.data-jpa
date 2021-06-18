package com.example.database.jpa.model.beans;

import it.sysx.abstracts.AModelBean;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "test")
public class Test extends AModelBean implements Serializable {

    @Column(columnDefinition = "double(13,2)")
    private Double prezzo;

    @Column(precision = 10, scale = 3)
    private BigDecimal prezzo2;

    @Column(columnDefinition = "text")
    private String testo;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "elemento")
    private Elemento elemento;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @PrimaryKeyJoinColumn
    private ElementoSecondo elemento2;

    @Column(length = 100)
    private String descrizione;

    @Type(type = "yes_no")
    @Column
    private Boolean flag;

    @Column(nullable = false)
    private Integer intero;

    @Column(nullable = false)
    private Time orario;

    @Column(length = 1)
    private String sesso;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date create_date;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date modify_date;

    @Temporal(TemporalType.DATE)
    @Column
    private Date giorno;

    @Column
    private Date giorno2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ente")
    private Ente ente;

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal getPrezzo2() {
        return prezzo2;
    }

    public void setPrezzo2(BigDecimal prezzo2) {
        this.prezzo2 = prezzo2;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Integer getIntero() {
        return intero;
    }

    public void setIntero(Integer intero) {
        this.intero = intero;
    }

    public Time getOrario() {
        return orario;
    }

    public void setOrario(Time orario) {
        this.orario = orario;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public Date getGiorno() {
        return giorno;
    }

    public void setGiorno(Date giorno) {
        this.giorno = giorno;
    }

    public Date getGiorno2() {
        return giorno2;
    }

    public void setGiorno2(Date giorno2) {
        this.giorno2 = giorno2;
    }

    public Ente getEnte() {
        return ente;
    }

    public void setEnte(Ente ente) {
        this.ente = ente;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    public ElementoSecondo getElemento2() {
        return elemento2;
    }

    public void setElemento2(ElementoSecondo elemento2) {
        this.elemento2 = elemento2;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getModify_date() {
        return modify_date;
    }

    public void setModify_date(Date modify_date) {
        this.modify_date = modify_date;
    }

}