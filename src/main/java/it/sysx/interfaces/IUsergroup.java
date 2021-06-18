package it.sysx.interfaces;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public interface IUsergroup {

    public void setId(Long id);

    public Long getId();

    public void setGroupname(String groupName);

    public String getGroupname();

}
