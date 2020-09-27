package com.example.petclinic.model;

import java.util.Set;

/**
 * @author Alexander Verkhoturkin
 * created 29/06/2020 - 10:58
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
