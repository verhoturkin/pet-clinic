package com.example.petclinic.model;

/**
 * created 27.09.2020 - 17:51
 *
 * @author Alexander Verkhoturkin
 */
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
