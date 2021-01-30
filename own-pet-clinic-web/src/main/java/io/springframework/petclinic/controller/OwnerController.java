/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.springframework.petclinic.controller;

import io.springframework.petclinic.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author msulbara
 */
// otra forma de hacer el request mapping
// este sera el mapping principal prefijo de todo para este controlador
@RequestMapping("/owners")
@Controller
public class OwnerController {

    final OwnerService ownerService;

    // autowired implicit
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    // estos mapping se concatenaran al mapping principal
    // que esta a nivel de clase ej: /owners/index
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model) {

        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }

    @RequestMapping("/find")
    public String findOwners() {

        return "notimplemented";
    }

    @GetMapping("/{ownerId}")
    public ModelAndView showOwner(@PathVariable Long ownerId) {
        ModelAndView mav = new ModelAndView("owners/ownerDetails");
        mav.addObject(ownerService.findById(ownerId));

        return mav;
    }

}
