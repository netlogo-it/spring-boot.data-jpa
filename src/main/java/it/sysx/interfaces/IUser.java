package it.sysx.interfaces;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public interface IUser {

    public void setId(Long id);

    public Long getId();

    public void setUsername(String username);

    public String getUsername();

    public void setPassword(String password);

    public String getPassword();

    public void setUsergroup(IUsergroup usergroup);

    public IUsergroup getUsergroup();
}
