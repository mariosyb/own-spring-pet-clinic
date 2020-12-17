/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.springframework.petclinic.service;

import io.springframework.petclinic.model.Owner;
import java.util.Set;

/**
 *
 * @author msulbara
 */
public interface OwnerService extends CrudService<Owner, Long> {
    
    Owner findByLastName(String lastName);
    
}
