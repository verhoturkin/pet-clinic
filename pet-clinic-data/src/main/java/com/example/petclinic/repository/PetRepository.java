package com.example.petclinic.repository;

import com.example.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * created 14.11.2020
 *
 * @author Alexander Verkhoturkin
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
