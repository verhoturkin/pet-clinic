package com.example.petclinic.services;

import com.example.petclinic.model.Vet;

import java.util.Set;

/**
 * created 29/06/2020 - 14:02
 *
 * @author Alexander Verkhoturkin
 */

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
