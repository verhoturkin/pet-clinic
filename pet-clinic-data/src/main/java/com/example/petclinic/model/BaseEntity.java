package com.example.petclinic.model;

import java.io.Serializable;

/**
 * created 29/06/2020 - 16:06
 *
 * @author Alexander Verkhoturkin
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
