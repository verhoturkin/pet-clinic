package com.example.petclinic.services.map;

import com.example.petclinic.model.Speciality;
import com.example.petclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * created 27.09.2020 - 18:45
 *
 * @author Alexander Verkhoturkin
 */

@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {

    @Override
    public Set<Speciality> findAll() {
        return super.findall();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
