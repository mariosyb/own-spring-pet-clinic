/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.springframework.petclinic.model;

/**
 *
 * @author msulbara
 */
public class PetType extends BaseEntity {

    private String name;

    public PetType() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
