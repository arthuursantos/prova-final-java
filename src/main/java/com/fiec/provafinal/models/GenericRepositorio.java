package com.fiec.provafinal.models;

import java.util.List;

public interface GenericRepositorio<T, U> {

    T create(T pessoa);
    List<T> findAll();
    T findById(U id);
    void update(T pessoa, U id);
    void delete(U id);

}
