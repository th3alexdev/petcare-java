package com.th3alexdev.petcarejava.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PersistenceController {
    private static final EntityManagerFactory entityManagerFactory = entityManagerFactoryProvider();

    private static EntityManagerFactory entityManagerFactoryProvider(){
        return Persistence.createEntityManagerFactory("petcarejpa");
    }

    public static EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
}
