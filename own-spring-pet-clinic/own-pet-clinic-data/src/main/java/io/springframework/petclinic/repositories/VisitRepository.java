/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.springframework.petclinic.repositories;

import io.springframework.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author msulbara
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {

}
