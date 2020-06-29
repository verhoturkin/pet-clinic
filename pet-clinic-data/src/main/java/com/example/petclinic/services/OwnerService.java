package com.example.petclinic.services;

import com.example.petclinic.model.Owner;

import java.util.Set;

/**
 * created 29/06/2020 - 14:00
 *
 * @author Alexander Verkhoturkin
 */

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
