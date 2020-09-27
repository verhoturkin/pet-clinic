package com.example.petclinic.model;

/**
 * created 27.09.2020 - 17:51
 *
 * @author Alexander Verkhoturkin
 */
public class Speciality extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
