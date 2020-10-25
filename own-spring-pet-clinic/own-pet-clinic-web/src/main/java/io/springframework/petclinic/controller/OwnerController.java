/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.springframework.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author msulbara
 */
// otra forma de hacer el request mapping
// este sera el mapping principal prefijo de todo para este controlador
@RequestMapping("/owners")
@Controller
public class OwnerController {

    // estos mapping se concatenaran al mapping principal
    // que esta a nivel de clase ej: /owners/index
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners() {

        return "owners/index";
    }

}
