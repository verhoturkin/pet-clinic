package com.example.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created 29/06/2020 - 17:33
 *
 * @author Alexander Verkhoturkin
 */
@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "vets/index.html"})
    public String listVets() {
        return "vets/index";
    }
}
