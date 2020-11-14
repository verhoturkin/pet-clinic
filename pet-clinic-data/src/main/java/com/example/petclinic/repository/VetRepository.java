package com.example.petclinic.repository;

import com.example.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * created 14.11.2020
 *
 * @author Alexander Verkhoturkin
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
