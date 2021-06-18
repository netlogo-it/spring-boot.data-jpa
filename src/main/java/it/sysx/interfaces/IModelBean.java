package it.sysx.interfaces;

import java.sql.Timestamp;

public interface IModelBean {

    public void setId(Long id);

    public Long getId();

    public void setVer(Timestamp ver);

    public Timestamp getVer();
}
