package com.example.petclinic.services.datajpa;

import com.example.petclinic.model.Pet;
import com.example.petclinic.repository.PetRepository;
import com.example.petclinic.services.PetService;
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
public class PetDataJpaService implements PetService {

    private final PetRepository petRepository;

    public PetDataJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    @Override
    public Pet save(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public void delete(Pet pet) {
        petRepository.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }
}
