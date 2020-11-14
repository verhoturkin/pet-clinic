package com.example.petclinic.services.datajpa;

import com.example.petclinic.model.Speciality;
import com.example.petclinic.repository.SpecialityRepository;
import com.example.petclinic.services.SpecialityService;
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
public class SpecialityDataJpaService implements SpecialityService {

    private final SpecialityRepository specialityRepository;

    public SpecialityDataJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long id) {
        return specialityRepository.findById(id).orElse(null);
    }

    @Override
    public Speciality save(Speciality speciality) {
        return specialityRepository.save(speciality);
    }

    @Override
    public void delete(Speciality speciality) {
        specialityRepository.delete(speciality);
    }

    @Override
    public void deleteById(Long id) {
        specialityRepository.deleteById(id);
    }
}
