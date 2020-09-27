package com.example.petclinic.model;

import java.util.Set;

/**
 * @author Alexander Verkhoturkin
 * created 29/06/2020 - 10:57
 */
public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
