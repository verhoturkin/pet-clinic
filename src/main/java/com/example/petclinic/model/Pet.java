package com.example.petclinic.model;

import java.time.LocalDate;

/**
 * @author Alexander Verkhoturkin
 * @created 29/06/2020 - 10:58
 */
public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthday;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
