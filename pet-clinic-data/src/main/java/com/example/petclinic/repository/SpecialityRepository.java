package com.example.petclinic.repository;

import com.example.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * created 14.11.2020
 *
 * @author Alexander Verkhoturkin
 */
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
