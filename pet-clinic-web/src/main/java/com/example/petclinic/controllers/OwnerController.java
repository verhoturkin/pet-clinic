package com.example.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created 29/06/2020 - 17:39
 *
 * @author Alexander Verkhoturkin
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners() {
        return "owners/index";
    }
}
