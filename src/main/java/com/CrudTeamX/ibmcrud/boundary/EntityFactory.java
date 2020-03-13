package com.CrudTeamX.ibmcrud.boundary;

import com.CrudTeamX.ibmcrud.entity.MyEntity;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EntityFactory {
    @Inject
    EntityCreator entityCreator;

    @PersistenceContext(unitName = "prod")
    EntityManager entityManager;

    public MyEntity CreatEntity(){
        MyEntity myEntity = new MyEntity();
        return myEntity;
    }
}
