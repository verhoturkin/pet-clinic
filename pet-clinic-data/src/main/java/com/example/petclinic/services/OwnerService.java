package com.example.petclinic.services;

import com.example.petclinic.model.Owner;

/**
 * created 29/06/2020 - 14:00
 *
 * @author Alexander Verkhoturkin
 */

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
