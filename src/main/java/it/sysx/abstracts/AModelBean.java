package it.sysx.abstracts;

import it.sysx.interfaces.IModelBean;

import java.sql.Timestamp;
import javax.persistence.*;

@MappedSuperclass
public abstract class AModelBean implements IModelBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Version
    private Timestamp ver;

    @Override
    public void setVer(Timestamp ver) {
        this.ver = ver;
    }

    @Override
    public Timestamp getVer() {
        return this.ver;
    }

}
