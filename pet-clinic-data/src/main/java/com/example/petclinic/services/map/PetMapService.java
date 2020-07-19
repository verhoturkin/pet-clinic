package com.example.petclinic.services.map;

import com.example.petclinic.model.Pet;
import com.example.petclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * created 29/06/2020 - 17:04
 *
 * @author Alexander Verkhoturkin
 */

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findall();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
