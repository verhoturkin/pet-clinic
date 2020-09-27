package com.example.petclinic.bootstrap;

import com.example.petclinic.model.Owner;
import com.example.petclinic.model.PetType;
import com.example.petclinic.model.Vet;
import com.example.petclinic.services.OwnerService;
import com.example.petclinic.services.PetTypeService;
import com.example.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * created 29/06/2020 - 18:58
 *
 * @author Alexander Verkhoturkin
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(dog);

        Owner owner1 = new Owner();
        owner1.setFirstName("Owner1first");
        owner1.setLastName("Owner1last");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Owner2first");
        owner2.setLastName("Owner2last");
        ownerService.save(owner2);

        System.out.println("Loaded owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("Vet1first");
        vet1.setLastName("Vet1last");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Vet2first");
        vet2.setLastName("Vet2last");
        vetService.save(vet2);

        System.out.println("Loaded vets");
    }

}
