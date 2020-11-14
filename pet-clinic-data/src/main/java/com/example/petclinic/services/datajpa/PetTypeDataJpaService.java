package com.example.petclinic.services.datajpa;

import com.example.petclinic.model.PetType;
import com.example.petclinic.repository.PetTypeRepository;
import com.example.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * created 14.11.2020
 *
 * @author Alexander Verkhoturkin
 */
@Service
@Profile("datajpa")
public class PetTypeDataJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeDataJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> types = new HashSet<>();
        petTypeRepository.findAll().forEach(types::add);
        return types;
    }

    @Override
    public PetType findById(Long id) {
        return petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PetType save(PetType petType) {
        return petTypeRepository.save(petType);
    }

    @Override
    public void delete(PetType petType) {
        petTypeRepository.delete(petType);
    }

    @Override
    public void deleteById(Long id) {
        petTypeRepository.deleteById(id);
    }
}
