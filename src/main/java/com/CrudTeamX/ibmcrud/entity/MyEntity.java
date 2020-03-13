package com.CrudTeamX.ibmcrud.entity;

import javax.persistence.*;

@Entity
public class MyEntity {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
