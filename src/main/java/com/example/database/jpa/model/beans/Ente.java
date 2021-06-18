package com.example.database.jpa.model.beans;

import javax.persistence.*;
import java.io.Serializable;

import it.sysx.abstracts.AModelBean;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ente")
public class Ente extends AModelBean implements Serializable {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ente")
    private List<Test> listTest = new ArrayList();

    @Embedded
    private EnteInfo enteInfo;

    public EnteInfo getEnteInfo() {
        return enteInfo;
    }

    public void setEnteInfo(EnteInfo enteInfo) {
        this.enteInfo = enteInfo;
    }

    public List<Test> getListTest() {
        return listTest;
    }

    public void setListTest(List<Test> listTest) {
        this.listTest = listTest;
    }

    @Column(name = "comune")
    private String comune;

    public void setComune(String comune) {
        this.comune = comune;
    }

    public String getComune() {
        return this.comune;
    }

    @Column(name = "provincia_sigla")
    private String provincia_sigla;

    public void setProvincia_sigla(String provincia_sigla) {
        this.provincia_sigla = provincia_sigla;
    }

    public String getProvincia_sigla() {
        return this.provincia_sigla;
    }

    @Column(name = "provincia")
    private String provincia;

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getProvincia() {
        return this.provincia;
    }

    @Column(name = "codice_istat")
    private String codice_istat;

    public void setCodice_istat(String codice_istat) {
        this.codice_istat = codice_istat;
    }

    public String getCodice_istat() {
        return this.codice_istat;
    }

    @Column(name = "cap")
    private String cap;

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getCap() {
        return this.cap;
    }

    @Column(name = "codice_fiscale")
    private String codice_fiscale;

    public void setCodice_fiscale(String codice_fiscale) {
        this.codice_fiscale = codice_fiscale;
    }

    public String getCodice_fiscale() {
        return this.codice_fiscale;
    }

    @Column(name = "codint")
    private String codint;

    public void setCodint(String codint) {
        this.codint = codint;
    }

    public String getCodint() {
        return this.codint;
    }

    @Column(name = "codbdap")
    private String codbdap;

    public void setCodbdap(String codbdap) {
        this.codbdap = codbdap;
    }

    public String getCodbdap() {
        return this.codbdap;
    }

    @Column(name = "indirizzo")
    private String indirizzo;

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getIndirizzo() {
        return this.indirizzo;
    }

}
