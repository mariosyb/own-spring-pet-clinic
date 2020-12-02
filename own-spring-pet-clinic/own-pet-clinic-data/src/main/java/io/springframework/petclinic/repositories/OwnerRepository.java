/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.springframework.petclinic.repositories;

import io.springframework.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author msulbara
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
