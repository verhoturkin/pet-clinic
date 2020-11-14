package com.example.petclinic.repository;

import com.example.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * created 14.11.2020
 *
 * @author Alexander Verkhoturkin
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
