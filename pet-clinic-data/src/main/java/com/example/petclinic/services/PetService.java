package com.example.petclinic.services;

import com.example.petclinic.model.Pet;

import java.util.Set;

/**
 * created 29/06/2020 - 14:01
 *
 * @author Alexander Verkhoturkin
 */

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
