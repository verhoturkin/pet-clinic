package com.example.petclinic.services;

import java.util.Set;

/**
 * created 29/06/2020 - 16:47
 *
 * @author Alexander Verkhoturkin
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
