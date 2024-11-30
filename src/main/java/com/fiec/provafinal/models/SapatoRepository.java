package com.fiec.provafinal.models;

import jakarta.persistence.EntityManager;

public class SapatoRepository extends GenericRepositorioImpl<Sapato, String> {

    public SapatoRepository(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    Class<Sapato> getMyClass() {
        return Sapato.class;
    }
}
