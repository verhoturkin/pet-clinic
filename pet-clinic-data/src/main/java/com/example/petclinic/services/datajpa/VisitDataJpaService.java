package com.example.petclinic.services.datajpa;

import com.example.petclinic.model.Visit;
import com.example.petclinic.repository.VisitRepository;
import com.example.petclinic.services.VisitService;
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
public class VisitDataJpaService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitDataJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long id) {
        return visitRepository.findById(id).orElse(null);
    }

    @Override
    public Visit save(Visit visit) {
        return visitRepository.save(visit);
    }

    @Override
    public void delete(Visit visit) {
        visitRepository.delete(visit);
    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);
    }
}
